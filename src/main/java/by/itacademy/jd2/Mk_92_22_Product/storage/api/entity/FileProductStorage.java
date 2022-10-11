package by.itacademy.jd2.Mk_92_22_Product.storage.api.entity;

import by.itacademy.jd2.Mk_92_22_Product.entity.Product;
import by.itacademy.jd2.Mk_92_22_Product.storage.api.IProductStorage;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class FileProductStorage implements IProductStorage {

    private final AtomicLong counter = new AtomicLong(0);

    private final String pathToFile;
    private final ObjectMapper mapper = new ObjectMapper();

    public FileProductStorage()  {
        String home = System.getenv("CATALINA_HOME");
        if (home == null || home.isBlank()) {
            throw new IllegalStateException("There isn't variavble enviroment");
        }
        this.pathToFile = home + File.separator + "conf" + File.separator + "product.txt";
    }

    public FileProductStorage(String pathToDir) {
        File f = new File(pathToDir);
        if (!f.isDirectory()) {
            throw new IllegalArgumentException("You need send path to file");
        }
        if (!f.canWrite()) {
            throw new IllegalArgumentException("We can not write in file ");
        }
        this.pathToFile = f.getAbsolutePath() + File.separator + "product.txt";
    }

    @Override
    public List<Product> get() {
        List<Product> products =new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                products.add(mapper.readValue(line,Product.class));
                }
            return products;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product getId(Long id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Product product = mapper.readValue(line, Product.class);
                if (id.equals(product.getId())) {
                    return product;
                }
            }
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void add(Product item) {
        item.setId(counter.incrementAndGet());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFile))) {
            writer.write(mapper.writeValueAsString(item));
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

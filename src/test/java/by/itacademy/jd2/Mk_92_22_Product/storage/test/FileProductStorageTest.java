package by.itacademy.jd2.Mk_92_22_Product.storage.test;

import by.itacademy.jd2.Mk_92_22_Product.entity.Product;
import by.itacademy.jd2.Mk_92_22_Product.entity.ProductBuilder;
import by.itacademy.jd2.Mk_92_22_Product.storage.api.entity.FileProductStorage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileProductStorageTest {

    @Test
    public void save(){
        //System.out.println((System.getProperty("java.io.tmpdir")));
        FileProductStorage storage =new FileProductStorage(System.getProperty("java.io.tmpdir"));
        Product product = ProductBuilder.create()
                .setName("iPhone")
                .setPrice(100)
                .build();
        storage.add(product);

        Assertions.assertNotNull(product.getId() );

        Product byId = storage.getId(product.getId());

        Assertions.assertEquals("iPhone",byId.getName());
        Assertions.assertEquals(100,byId.getPrice());
    }
}

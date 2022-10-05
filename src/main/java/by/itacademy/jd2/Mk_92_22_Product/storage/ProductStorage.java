package by.itacademy.jd2.Mk_92_22_Product.storage;

import by.itacademy.jd2.Mk_92_22_Product.entity.Product;
import by.itacademy.jd2.Mk_92_22_Product.entity.ProductBuilder;
import by.itacademy.jd2.Mk_92_22_Product.storage.api.IProductStorage;

import java.util.ArrayList;
import java.util.List;

public class ProductStorage implements IProductStorage {

    private static ProductStorage INSTANCE = new ProductStorage();

    private List<Product> data = new ArrayList<>();
    private ProductStorage (){
        this.data.add(ProductBuilder
                .create().setId(1).setName("Iphone1").setPrice(10).setSale(1).setAbout("2007 year")
                .build());
        this.data.add(ProductBuilder
                .create().setId(2).setName("Iphone3G").setPrice(30).setSale(3).setAbout("2008 year")
                .build());
        this.data.add(ProductBuilder
                .create().setId(3).setName("Iphone3GS").setPrice(50).setSale(4).setAbout("2009 year")
                .build());
        this.data.add(ProductBuilder
                .create().setId(4).setName("Iphone4").setPrice(75).setSale(5).setAbout("2010 year")
                .build());
        this.data.add(ProductBuilder
                .create().setId(5).setName("Iphone4s").setPrice(90).setSale(7).setAbout("2011 year")
                .build());
        this.data.add(ProductBuilder
                .create().setId(6).setName("Iphone5").setPrice(100).setSale(8).setAbout("2012 year")
                .build());
        this.data.add(ProductBuilder
                .create().setId(7).setName("Iphone5s").setPrice(120).setSale(10).setAbout("2013 year")
                .build());
        this.data.add(ProductBuilder
                .create().setId(8).setName("Iphone6").setPrice(150).setSale(12).setAbout("2014 year")
                .build());
    }

    @Override
    public List get() {
        return this.data;
    }

    @Override
    public Product getId(int id) {
        return this.data.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static ProductStorage getInstance(){
        return INSTANCE;
    }

    public void add(int id,String name,int price,int sale,String about){
        this.data.add(ProductBuilder.create()
                        .setId(id)
                        .setName(name)
                        .setPrice(price)
                        .setSale(sale)
                        .setAbout(about)
                .build());
    }

}

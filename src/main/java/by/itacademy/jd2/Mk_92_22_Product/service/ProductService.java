package by.itacademy.jd2.Mk_92_22_Product.service;

import by.itacademy.jd2.Mk_92_22_Product.core.ProductDTO;
import by.itacademy.jd2.Mk_92_22_Product.entity.Product;
import by.itacademy.jd2.Mk_92_22_Product.entity.ProductBuilder;
import by.itacademy.jd2.Mk_92_22_Product.service.api.IProductService;
import by.itacademy.jd2.Mk_92_22_Product.storage.ProductStorage;
import by.itacademy.jd2.Mk_92_22_Product.storage.api.IProductStorage;

import java.util.List;

public class ProductService implements IProductService {

    private static final ProductService INSTANCE = new ProductService();

    private IProductStorage STORAGE;


    public ProductService() {
        this.STORAGE = ProductStorage.getInstance();
    }

    @Override
    public List<Product> get() {
        return this.STORAGE.get();
    }


    @Override
    public Product getId(Long id) {
        return this.STORAGE.getId(id);
    }

    @Override
    public void validate(ProductDTO item) {
        if(item.getName()==null || item.getName().isBlank()){
            throw new IllegalArgumentException("You set invalid name fucking idiot");
        }
        if(item.getPrice()<=0 || item.getPrice()>100_000_000){
            throw new IllegalArgumentException("You set invalid price fucking idiot");
        }
        if (item.getSale()>=item.getPrice() || item.getSale()<=0 ){
            throw new IllegalArgumentException("You set invalid sale fucking idiot");
        }
        if(item.getAbout()==null || item.getAbout().isBlank()){
            throw new IllegalArgumentException("You didn't pass any description fucking idiot");
        }
        STORAGE.add(ProductBuilder.create()
                .setId(1l)
                .setName(item.getName())
                .setPrice(item.getPrice())
                .setSale(item.getSale())
                .setAbout(item.getAbout())
                .build());

    }

    public static ProductService getInstance(){
        return INSTANCE;
    }


}

package by.itacademy.jd2.Mk_92_22_Product.service;

import by.itacademy.jd2.Mk_92_22_Product.entity.Product;
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
    public Product getId(int id) {
        return this.STORAGE.getId(id);
    }

    @Override
    public void validate(Product item) {

    }
    public static ProductService getInstance(){
        return INSTANCE;
    }


}

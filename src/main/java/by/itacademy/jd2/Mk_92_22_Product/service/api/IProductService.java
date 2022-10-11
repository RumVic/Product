package by.itacademy.jd2.Mk_92_22_Product.service.api;

import by.itacademy.jd2.Mk_92_22_Product.entity.Product;

public interface IProductService extends IEssenceService<Product>{
    Product getId(Long id);
}

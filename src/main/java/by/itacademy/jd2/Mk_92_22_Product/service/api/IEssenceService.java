package by.itacademy.jd2.Mk_92_22_Product.service.api;

import by.itacademy.jd2.Mk_92_22_Product.core.ProductDTO;

import java.util.List;

public interface IEssenceService<TYPE> {

    List<TYPE> get();

    TYPE getId(Long id);

    void validate(ProductDTO item);

}

package by.itacademy.jd2.Mk_92_22_Product.service.api;

import java.util.List;

public interface IEssenceService<TYPE> {

    List<TYPE> get();

    TYPE getId(int id);

    void validate(TYPE item);

}

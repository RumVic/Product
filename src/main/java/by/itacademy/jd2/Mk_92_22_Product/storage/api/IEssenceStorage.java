package by.itacademy.jd2.Mk_92_22_Product.storage.api;


import java.util.List;

public interface IEssenceStorage<TYPE> {

    List<TYPE> get();

    TYPE getId (Long id);

    void add (TYPE item);







}

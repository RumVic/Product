package by.itacademy.jd2.Mk_92_22_Product.storage.api;

import by.itacademy.jd2.Mk_92_22_Product.entity.Product;

import java.util.List;

public interface IEssenceStorage<TYPE> {

    List<TYPE> get();

    TYPE getId (int id);

    //void save();







}

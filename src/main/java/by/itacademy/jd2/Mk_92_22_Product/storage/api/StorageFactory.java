package by.itacademy.jd2.Mk_92_22_Product.storage.api;

import by.itacademy.jd2.Mk_92_22_Product.storage.api.entity.FileProductStorage;

public class StorageFactory implements IStorageFactory {

    private static final IStorageFactory INSTANCE = new StorageFactory();
    private IEssenceStorage productStorage;

    public StorageFactory() {
        this.productStorage = new FileProductStorage();
    }

    @Override
    public IEssenceStorage getProductStorage() {
        return productStorage;
    }
    public static IStorageFactory getInstance () {
        return INSTANCE;
    }
}

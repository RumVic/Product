package by.itacademy.jd2.Mk_92_22_Product.entity;

public class ProductBuilder {
    int id;
    String name;
    int price;
    double sale;
    String about;

    private static final ProductBuilder INSTANCE = new ProductBuilder();

    private ProductBuilder() {
    }

    public static ProductBuilder create() {
        return new ProductBuilder();
    }

    public ProductBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;

    }

    public ProductBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setSale(double sale) {
        this.sale = sale;
        return this;
    }

    public ProductBuilder setAbout(String about) {
        this.about = about;
        return this;
    }

    public Product build() {
        return new Product(id, name, price, sale, about);
    }
}

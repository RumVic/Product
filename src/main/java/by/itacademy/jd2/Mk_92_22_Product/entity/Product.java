package by.itacademy.jd2.Mk_92_22_Product.entity;

import java.util.Objects;

public class Product {
    int id;
    String name;
    double price;
    double sale;
    String about;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getSale() {
        return sale;
    }

    public String getAbout() {
        return about;
    }

    public Product(int id, String name, int price, double sale, String about) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sale = sale;
        this.about = about;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.price, price) == 0 && Double.compare(product.sale, sale) == 0 && name.equals(product.name) && about.equals(product.about);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, sale, about);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                ", about='" + about + '\'' +
                '}';
    }
}

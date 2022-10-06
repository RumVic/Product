package by.itacademy.jd2.Mk_92_22_Product.core;

import java.util.Objects;

public class ProductDTO {
    String name;
    double price;
    double sale;
    String about;

    public ProductDTO(String name, double price, double sale, String about) {
        this.name = name;
        this.price = price;
        this.sale = sale;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDTO that = (ProductDTO) o;
        return Double.compare(that.price, price) == 0 && Double.compare(that.sale, sale) == 0 && name.equals(that.name) && about.equals(that.about);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, sale, about);
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                ", about='" + about + '\'' +
                '}';
    }
}

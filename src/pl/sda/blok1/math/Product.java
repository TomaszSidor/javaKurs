package pl.sda.blok1.math;

public class Product {

    private static int counter = 100;
    private int id;
    private String name;
    private double price;

    {
       id = counter++;
    }


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice()  +
                '}';
    }
}

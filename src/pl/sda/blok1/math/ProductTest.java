package pl.sda.blok1.math;

import pl.sda.blok1.interface1.Plant;

public class ProductTest {
    public static void main(String[] args) {
        Product TV = new Product("FlatScreen",354.52);
        Product DVD = new Product("DVD Player full HD",155);

        System.out.println(TV.toString());
        System.out.println(DVD.toString());
    }
}

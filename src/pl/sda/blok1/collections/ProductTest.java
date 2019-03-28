package pl.sda.blok1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductTest {
    public static List<Product> productList = new ArrayList();

    public static Map<Integer, String> createAMap(List productList){
        Map<Integer, String> result = new HashMap<>();
        for (Product product : productList) {


            result.put()
        }


        return
    }




    public static void main(String[] args) {
        Product tv = new Product(1, "TV");
        Product dvd = new Product(2, "DVD Player");
        Product playStation = new Product(3,"Sony PS4");


        productList.add(tv);
        productList.add(dvd);
        productList.add(playStation);





    }
}

package pl.sda.blok1.encapsulation;

import pl.sda.blok1.encapsulation.cart.Cart;
import pl.sda.blok1.encapsulation.item.ItemManager;
import pl.sda.blok1.encapsulation.item.ItemModel;
import pl.sda.blok1.encapsulation.user.UserManager;
import pl.sda.blok1.encapsulation.user.UserModel;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        //
        ItemManager newManager = new ItemManager(); //nowy manager
        ItemModel computer = newManager.createShopItem("computer", "moj laptop", 2500);
        // metoda createShopItep z klasy ItemManager tworzy nowy Item
//        System.out.println(computer);
        ItemModel printer = newManager.createShopItem("printer", "laserJet HP", 1000);
//        System.out.println(printer);
        ItemModel monitor = newManager.createShopItem("monitor", "Lenovo 28'", 1500);
//        System.out.println(monitor);
        ItemModel tv = newManager.createShopItem("tv", "LG OLED 85'", 10000);
//        System.out.println(tv);



        UserManager newUserManager = new UserManager();
        newUserManager.createUser("Zenek", "Kowalski", 35);
        UserModel zenek = newUserManager.getUser();
        newUserManager.createUser("Michal", "Sidor", 30);
        UserModel michal = newUserManager.getUser();

//        System.out.println(zenek);
//        System.out.println(michal);

        Cart zenekCart = new Cart();
//        System.out.println("Dodaj zakupy do koszyka. Wpisz co chcesz kupić z listy: computer, printer, monitor," +
//                " tv i po przecinku podaj ilość:");
//        Scanner in = new Scanner(System.in);
//
//        int i = 0;
//
//        String items[] = new String[45];
//        items[i] = in.nextLine();
//
//        System.out.println(items[i]);
//        i++;
        ItemModel[] list = {computer, monitor, printer};
        zenekCart.setShoppingList(list);
        zenekCart.setTotalCost(list);
        System.out.println("Lista " + zenekCart.toString());
        System.out.println("Cena " + zenekCart.getTotalCost());




    }
}

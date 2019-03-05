package pl.sda.blok1.encapsulation.cart;

import pl.sda.blok1.encapsulation.item.ItemModel;

import java.util.Arrays;

public class Cart {
    private ItemModel[] shoppingList;
    private double totalCost = 0;


    public void setShoppingList(ItemModel... shoppingList) {
        this.shoppingList = shoppingList;
    }

    public void setTotalCost(ItemModel[] shoppingList){
        double totalCost = 0;

        for (int i = 0; i < shoppingList.length; i++){
           totalCost = totalCost + shoppingList[i].getPrice();
        }
        System.out.println("w metodzie cost " + totalCost);
        this.totalCost = totalCost;
    }

    public ItemModel[] getShoppingList() {
        return shoppingList;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "shoppingList=" + Arrays.toString(shoppingList) +
                '}';
    }
}

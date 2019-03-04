package pl.sda.blok1.task.cart;

import pl.sda.blok1.task.item.ItemModel;

public class Cart {
    private ItemModel[] shoppingList;
    private double totalCost = 0;


    public void setShoppingList(ItemModel[] shoppingList) {
        this.shoppingList = shoppingList;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public ItemModel[] getShoppingList() {
        return shoppingList;
    }

    public double getTotalCost() {
        return totalCost;
    }
}

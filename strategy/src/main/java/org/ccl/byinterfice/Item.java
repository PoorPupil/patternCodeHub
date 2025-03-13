package org.ccl.byinterfice;

public class Item {

    private int price;
    private String itemName;

    public Item(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooad2.Model;

/**
 *
 * @author alahm
 */
public class Item {

    private String itemName;
    private double price;
    private int quantity = 0;

    public Item(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItemPrice(int q, double p) {
        return q * p;
    }

    @Override
    public String toString() {
        return "Item{" + "itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + '}';
    }

}

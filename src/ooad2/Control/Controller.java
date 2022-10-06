/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooad2.Control;

import java.util.Vector;
import ooad2.Model.Item;
import ooad2.View.Menu;

/**
 *
 * @author alahm
 */
public class Controller {

    private Vector<Item> items = new Vector<>();

    public Controller() {
        initializedItems();
        new Menu(items).setVisible(true);
    }

    private void initializedItems() {
        String[] itemName = {"Chicken Burger", "Beef Burger", "Pizza", "Mix BBQ", "Soft Drink", "Mango Juice", "Apple Juice", "Water"};
        double[] itemPrice = {15, 20, 25, 30, 3, 7, 8, 2};

        for (int i = 0; i < itemName.length; i++) {
            items.add(new Item(itemName[i], itemPrice[i]));
        }
    }
}

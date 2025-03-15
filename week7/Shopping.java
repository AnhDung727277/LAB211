/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Shopping {
    private List<Fruit> fruits;
    private List<Order> orders;
    
    public Shopping() {
        fruits = new ArrayList<>();
        orders = new ArrayList<>();
    }
    public void createFruit(String fruitId, String fruitName, double price, int quantity, String origin){
        fruits.add(new Fruit(fruitId, fruitName, price, quantity, origin));
    }
    public Fruit getFruitByName(String fruitName) {
        for (Fruit fruit : fruits){
            if(fruit.getFruitName().equalsIgnoreCase(fruitName)){
                return fruit;
            }
        }
        return null;
    }
    public void createOrder(String customerName,ArrayList<OrderItem> item){
        Order order = new Order(customerName);
        for(OrderItem it: item)
            order.addItem(it);
        orders.add(order);
    }

    void OrderItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void shopping() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author DELL
 */
public class Fruit {
    private String FruitId;
    private String FruitName;
    private int quantity;
    private double price;
    private String origin;

    public Fruit(String FruitId, String FruitName, double price, int quantity, String origin) {
        this.FruitId = FruitId;
        this.FruitName = FruitName;
        this.quantity = quantity;
        this.price = price;
        this.origin = origin;
    }

    public String getFruitId() {
        return FruitId;
    }

    public String getFruitName() {
        return FruitName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getOrigin() {
        return origin;
    }
    public void setQuantity(int quantity) { 
        this.quantity = quantity; 
    }
}

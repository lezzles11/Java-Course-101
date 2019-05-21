/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lesleycheung
 */
public class Product {
    private final String name; 
    private final double price; 
    private final int amount; 
    
    public Product(String nameAtStart, double price, int amount) {
        this.name = nameAtStart; 
        this.price = price; 
        this.amount = amount; 
    }
            public void printProduct() {
            System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
        }
    }


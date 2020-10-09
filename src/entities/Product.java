/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Product implements Serializable{
    private String name;
    private int price;
    private int amount;
    private int id = 0;
    
    Product(String name,int price,int amount, int id){
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.id = id;
    }
    Product(String name,int price,int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    Product (Product a){
        this.name = a.getName();
        this.price = a.getPrice();
        this.amount = a.subAmount(id);
    }
    String print() {
        return "---\n" +name+ "\nCost: " + price + " \nAmount: "+amount+" \nID: : "+id+"\n---";
        
    }
    public void addAmount(int a){
        this.amount+=a;
    } 
    public int subAmount(int a){
        if (a < this.amount){
            this.amount = this.amount - a;
            return 0;
        } else if (a == this.amount){
            return 1;
        } else {
            return 2;
        }
    }
    Product product(Product in){
        return in;
    }

    
    
    
    public boolean equals(Product pro){
        return ((this.name.equals(pro.getName()))&& (this.price == pro.getPrice()));
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setId(int id) {
        this.amount = id;
    }

    
}

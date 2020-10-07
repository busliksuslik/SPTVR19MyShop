/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author nikita
 */
public class Goods {
    public String name;
    public int price;
    public int count;

    public Goods(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }
    public void showInfo(){
        System.out.println(this.name);
        System.out.println(this.price);
        System.out.println(this.count);
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import Tools.ProductSaver;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Storage implements Serializable{
    private Product[] products;
    private final ProductSaver saver = new ProductSaver();
    private final Scanner scan = new Scanner(System.in);
    public Storage(){
        products = saver.loadFile();
    }
    
    public void append(){
        boolean isSimmilar = false;
        System.out.printf("Product name: ");
        String name;
        do{
        name = scan.nextLine();
        }while("".equals(name) || "\n".equals(name) || name == null);
        System.out.printf("%nProduct price: ");
        int price = scan.nextInt();
        System.out.printf("%nProduct amount: ");
        int amount = scan.nextInt();
        Product product = new Product(name,price,amount);
        for (int i = 0 ; i < products.length ; i++){
            if (products[i] != null && products[i].equals(product)){
                products[i].addAmount(product.getAmount());
                isSimmilar = true;
                break;
            }
        }     
        if (!isSimmilar){
            for (int i = 0 ; i < products.length ; i++){
                if (products[i] == null){
                    products[i] = product;
                    break;
                }
            }
        }
    }
    public void printAll(){
        System.out.printf("----------");
        for (int i = 0 ; i < products.length ; i++){
            if (products[i] != null){
                System.out.printf(products[i].print());
            }
        }
        System.out.println("----------");
    }
    public void save(){
        saver.saveStorage(products);
    }
}

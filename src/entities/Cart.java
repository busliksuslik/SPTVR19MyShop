/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author user
 */
public class Cart {
    private Product[] products = new Product[100];
    public void append(Product product){
        boolean isSimmilar = false;
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
        System.out.printf("---CART---");
        for (int i = 0 ; i < products.length ; i++){
            if (products[i] != null){
                System.out.printf(products[i].print());
            }
        }
        System.out.println("----------");
    }
}

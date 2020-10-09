/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19shop;

import entities.Cart;
import entities.Storage;
import java.util.Scanner;

/**
 *
 * @author nikita
 */
class App {
    private final Scanner scan = new Scanner(System.in);
    private final Storage store = new Storage();
    private final Cart cart = new Cart();
    public void run(){
        boolean exit = true;
        do{
            System.out.printf("Exit - 0%nAdd product - 1(administrator)%nBuy product - 2%nShow All products - 3%nShow cart - 4%nIncert: ");
            int ch = scan.nextInt();
            switch(ch){
                case 0:{
                    exit = false;
                    break;
                }
                case 1:{
                    store.append();
                    store.save();
                    break;
                }
                case 2:{
                    cart.append(store.sell());
                    break;
                }
                case 3:{
                    store.printAll();
                    break;
                }
                case 4:{
                    cart.printAll();
                    break;
                }

            }
        }while(exit);
    }
}

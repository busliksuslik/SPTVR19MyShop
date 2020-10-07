/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19shop;

import entities.Goods;
import java.util.Scanner;

/**
 *
 * @author nikita
 */
class App {
    private final Goods[] goods = new Goods[100];
    private final Scanner scan = new Scanner(System.in);
    private boolean exit = true;
    public void run(){
        do{
            System.out.printf("Add product - 1%nSell product - 2%nShow All products - 3%nExit - 4%n");
            int ch = scan.nextInt();
            switch(ch){
                case 1:
                    addProduct();
                    break;
                case 2:
                    System.out.println("Insert product ID");
                    int id = scan.nextInt();
                    if (goods[id] == null){
                        System.out.println("Doesn't exist");
                    }
                    System.out.println("Insert number");
                    int num = scan.nextInt();
                    goods[id].count-=num;
                    break;
                case 3:
                    showGoods();
                    break;
                case 4:
                    exit = false;

            }
        }while(exit);
    }
    private void showGoods(){
        for (Goods good : this.goods) {
            if (good != null) {
                System.out.println("-------------------------");
                System.out.println("Name - " + good.name);
                System.out.println("Price - " + good.price);
                System.out.println("Count - " + good.count);
            }
        }
    }
    private void addProduct(){
        for (Goods good : this.goods) {
            if (good == null) {
                System.out.println("Insert name");
                scan.nextLine();
                String name = scan.nextLine();
                System.out.println("Insert price");
                int price = scan.nextInt();
                System.out.println("Insert number");
                int count = scan.nextInt();
                good = new Goods(name,price,count);
                break;
            }
        }
    }
    
}

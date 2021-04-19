package com.adbistju.applicationController;

import java.util.Scanner;

public class AppControl {

    ManagerApp managerApp;

    public void startApp(){
        Scanner scanner = new Scanner(System.in);
        boolean startWhile = true;
        while (startWhile) {
            String input = scanner.nextLine();
            String tokens[] = input.split("\\s");

            String command = tokens[0];
            switch (command) {
                case Commands.LIST_OF_PRODUCT:
                    if(tokens.length <= 1){
                        managerApp.getListBasket(true);
                        break;
                    } else if(tokens[1].equals("db")){
                        managerApp.getListDataBase(true);
                    } else if (tokens[1].equals("tr")){
                        managerApp.getListBasket(true);
                    }
                    break;
                case Commands.LIST_OF_PRODUCT_COST:
                    if(tokens.length <= 1){
                        managerApp.getListBasket(false);
                        break;
                    } else if (tokens[1].equals("db")){
                        managerApp.getListDataBase(false);
                    } else if (tokens[1].equals("tr")){
                        managerApp.getListBasket(false);
                    }
                    break;
                case Commands.DELETE_PRODUCT:
                    if(tokens.length >= 1){
                        managerApp.delProdListBasket(tokens[1]);
                    } else {
                        System.out.println("Вы не указали название продукта для удаления!");
                    }
                    break;
                case Commands.ADD_PRODUCT:
                    if(tokens.length >= 1){
                        managerApp.addToBasketIsProductRepo(tokens[1]);
                    } else {
                        System.out.println("Вы не указали название продукта для добавления!");
                    }
                    break;
//                case Commands.PRODUCT_CONTENT:
//                    System.out.println();
//                    break;
                case Commands.EXIT:
                    scanner.close();
                    startWhile = false;
                    break;
            }
        }
    }

    public ManagerApp getManagerApp() {
        return managerApp;
    }

    public void setManagerApp(ManagerApp managerApp) {
        this.managerApp = managerApp;
    }
}

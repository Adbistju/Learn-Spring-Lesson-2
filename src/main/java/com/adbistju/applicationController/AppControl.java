package com.adbistju.applicationController;

import java.util.Scanner;

public class AppControl {

    ManagerApp managerApp;

    public void startApp(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals(Commands.EXIT)) {
            String tokens[] = input.split("\\s");

            String command = tokens[0];
            switch (command) {
                case Commands.LIST_OF_PRODUCT:
                    managerApp.getListDataBase(true);
                    break;
                case Commands.LIST_OF_PRODUCT_COST:
                    managerApp.getListDataBase(false);
                    break;
                case Commands.DELETE_PRODUCT:
                    System.out.println();
                    break;
                case Commands.ADD_PRODUCT:
                    System.out.println();
                    break;
                case Commands.PRODUCT_CONTENT:
                    System.out.println();
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

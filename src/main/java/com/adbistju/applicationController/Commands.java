package com.adbistju.applicationController;

public interface Commands {
    String LIST_OF_PRODUCT = "ls";
    String LIST_OF_PRODUCT_COST = "ll";
    //список продуктов из бд или корзины

    String DELETE_PRODUCT = "dl";
    //удалить из корзины


    String ADD_PRODUCT = "add";
    //добавить продукт в корзину

    String PRODUCT_CONTENT = "cat";
    //описание продукта

    String EXIT = "exit";
    //выход из проги

    String HELP = "help";

    String CREATE_PRODUCT = "touch";
    //добавить в бд продукт

}

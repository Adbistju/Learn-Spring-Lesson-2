package com.adbistju;

import com.adbistju.applicationController.AppControl;
import com.adbistju.applicationController.PrinterTXT;
import com.adbistju.basket.BastketUser;
import com.adbistju.dataBase.ProductRepository;
import com.adbistju.obj.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

//
//        BastketUser bastketUser = new BastketUser();
//        for (int i = 0; i < 10; i++) {
//            bastketUser.addRepoList(new Product("aa"+i, i*10));
//        }

//        bastketUser.addRepoList(new Product("aфвфвфa", 110));
//        PrinterTXT.print(bastketUser.getArrayListProd());
//        PrinterTXT.print(productRepository.getRepoList());

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ProductRepository productRepository = context.getBean("productRepository",ProductRepository.class);
        for (int i = 0; i < 7; i++) {
            productRepository.addRepoList(new Product("aa"+i, i*10));
        }
        PrinterTXT.print(productRepository.getRepoList());
        AppControl appControl = context.getBean("appControl",AppControl.class);
        appControl.startApp();


    }
}

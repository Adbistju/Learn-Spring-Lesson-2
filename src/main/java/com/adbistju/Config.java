package com.adbistju;

import com.adbistju.applicationController.AppControl;
import com.adbistju.applicationController.ManagerApp;
import com.adbistju.basket.BastketUser;
import com.adbistju.dataBase.ProductRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
    @Bean(name = "productRepository")
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    @Bean(name = "bastketUser")
    public BastketUser bastketUser() {
        return new BastketUser();
    }

    @Bean(name = "managerApp")
    public ManagerApp managerApp(BastketUser bastketUser, ProductRepository productRepository) {
        ManagerApp managerApp = new ManagerApp();
        managerApp.setBastketUser(bastketUser);
        managerApp.setProductRepository(productRepository);
        return managerApp;
    }

    @Bean(name = "appControl")
    public AppControl appControl(ManagerApp managerApp) {
        AppControl appControl = new AppControl();
        appControl.setManagerApp(managerApp);
        return appControl;
    }
}

package com.adbistju.applicationController;

import com.adbistju.basket.BastketUser;
import com.adbistju.dataBase.ProductRepository;

public class ManagerApp {
    BastketUser bastketUser;
    ProductRepository productRepository;

    public void getListDataBase(boolean withCost){
        if (withCost){
            PrinterTXT.print(productRepository.getRepoList());
            return;
        } else {
            PrinterTXT.print(productRepository.getRepoList());
            return;
        }
    }

    public void getListBasket(boolean withCost){
        if (withCost){
            PrinterTXT.print(bastketUser.getArrayListProd());
            return;
        } else {
            PrinterTXT.print(bastketUser.getArrayListProd());
            return;
        }
    }

    public void delProdListBasket(String nameProd){
        bastketUser.removeRepoList(nameProd);
    }

    public void addProdListBasket(){

    }

    public void getContentProd(){

    }

    public void setBastketUser(BastketUser bastketUser) {
        this.bastketUser = bastketUser;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addToBasketIsProductRepo(String nameProduct){
        bastketUser.addRepoList(productRepository.searchIdProduct(nameProduct));
    }

    public BastketUser getBastketUser() {
        return bastketUser;
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }
}

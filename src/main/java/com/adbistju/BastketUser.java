package com.adbistju.basket;

import com.adbistju.obj.Product;

import java.util.ArrayList;
import java.util.LinkedList;

public class BastketUser {
    private ArrayList<Product> arrayListProd = new ArrayList(); //Тут map надо было бы применить.
    //private LinkedList<Product> arrayListProd = new LinkedList<Product>();
    public int size = 0;

    public void addRepoList(Product prod){
        size++;
        arrayListProd.add(prod);
    }

    public void removeRepoList(String nameProd){
        int index = -1;
        index = searchIdexRepoList(nameProd);
        if(index>=0){
            arrayListProd.remove(index);
        } else {
            System.err.println("Такого у нас нет!");
        }
    }

    private int searchIdexRepoList(String nameProd){
        for (int i = 0; i < arrayListProd.size(); i++) {
            if(arrayListProd.get(i).getName().equals(nameProd)){
                size--;
                return i;
            }
        }
        return -1;
    }

    public Product searchIdProduct(String nameProd){
        int index = -1;
        index = searchIdexRepoList(nameProd);
        if(index>=0){
            return arrayListProd.get(index);
        } else {
            System.out.println("У нас такого нет!");
            return null;
        }
    }

    public Product getProduct(int id){
        return arrayListProd.get(id);
    }

    public ArrayList<Product> getArrayListProd() {
        return arrayListProd;
    }
}

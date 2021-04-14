package com.adbistju.dataBase;

import com.adbistju.obj.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProductRepository {
    private ArrayList<Product> repoList = new ArrayList();
    //private LinkedList<Product> repoList = new LinkedList<Product>();
    public int size = 0;

    public void addRepoList(Product prod){
        size++;
        repoList.add(prod);
    }

    public void removeRepoList(String nameProd){
        int index = -1;
        index = searchIdexRepoList(nameProd);
        if(index>=0){
            repoList.remove(index);
        } else {
            System.err.println("Такого у нас нет!");
        }
    }

    private int searchIdexRepoList(String nameProd){
        for (int i = 0; i < repoList.size(); i++) {
            if(repoList.get(i).getName().equals(nameProd)){
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
            return repoList.get(index);
        } else {
            System.out.println("У нас такого нет!");
            return null;
        }
    }

    public Product getProduct(int id){
        return repoList.get(id);
    }

    public ArrayList<Product> getRepoList() {
        return repoList;
    }

    public void setRepoList(ArrayList<Product> repoList) {
        this.repoList = repoList;
    }
}

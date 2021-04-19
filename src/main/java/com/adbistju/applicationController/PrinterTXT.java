package com.adbistju.applicationController;

import com.adbistju.obj.Product;

import java.util.ArrayList;

public class PrinterTXT {
    public static void print(ArrayList<Product> arrayListProd){
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        String costLength = null;
        System.out.println("id||Name       ||Cost ||");
        for (int i = 0; i < arrayListProd.size(); i++) {
            stringBuilder.append(i);
            if (i<10){
                stringBuilder.append(" ");
            }
            stringBuilder.append("||");
            stringBuilder.append(arrayListProd.get(i).getName());
            if(arrayListProd.get(i).getName().length() <= 10){
                for (int j = 0; j < 10-arrayListProd.get(i).getName().length(); j++) {
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.append(" ||");
            stringBuilder.append(arrayListProd.get(i).getCost());
            costLength = String.valueOf(arrayListProd.get(i).getCost());
            if(costLength.length() <= 4){
                for (int j = 0; j < 4-costLength.length(); j++) {
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.append(" ||");
            str = stringBuilder.toString();
            System.out.println(str);
            str = "";
            stringBuilder.setLength(0);
        }
    }
}

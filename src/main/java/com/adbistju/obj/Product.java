package com.adbistju.obj;

public class Product {
    private static int idAll = 0;
    private int id;
    private String name;
    private int cost; /* тут надо бы применить другой тип данных
                        Currency класс или BigDecimal,
                        но на данном этапе это не требуется
                      */

    public Product(String name, int cost) {
        this.id = ++idAll;
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

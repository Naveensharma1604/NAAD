package com.company.task3.task3_2;

public class GroceryItem {
    String name;
     int pricePerKg;
    public GroceryItem(String name,int pricePerKg){
        this.name=name;
        this.pricePerKg=pricePerKg;
    }
    public String getName() {
        return name;
    }
    public int getPricePerKg() {
        return pricePerKg;
    }

}

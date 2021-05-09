package com.company.task3.task3_1;

public class product {

     String name;
     int price;
     public product(){

     }
     public product(String name,int price){
         this.price=price;
         this.name=name;
     }

    public int getPrice() {
        return price;
    }
    public String getName(){
         return name;
    }
    @Override
    public String toString(){
        return String.format("Name : %s @ Rs. %d",name,price);
    }
    @Override
    public boolean equals(Object o) {
        product Product = (product) o;

        return this.name.equals(Product.getName());
    }
}

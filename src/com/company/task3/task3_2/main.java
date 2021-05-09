package com.company.task3.task3_2;

public class main {
    public static void main(String[] args) {
        GroceryItem sugar = new GroceryItem("Sugar", 35);
        GroceryItem tea = new GroceryItem("tea", 40);
        GroceryItem apple = new GroceryItem("Apple", 100);
        GroceryItem orange = new GroceryItem("orange", 60);

        cart cart = new cart();
        cart.add(GroceryCartItem.createNew(sugar, "3kg 0g"))
                .add(GroceryCartItem.createNew(tea, "0kg 750g"))
                .add(GroceryCartItem.createNew(apple, "1kg 500g"))
                .add(GroceryCartItem.createNew(orange, "3kg 500g"));

        System.out.println(cart.toString());
    }
}

package com.company.task3.task3_2;

import java.util.ArrayList;

public class cart {
    ArrayList<GroceryCartItem> cartItems;
    float totalAmount;

    public cart() {
        cartItems = new ArrayList<>();
        totalAmount = 0;

    }

    cart add(GroceryCartItem item) {
        cartItems.add(item);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Cart{" +
                "\n\tgroceryCartItems = {");
        for (GroceryCartItem items : cartItems) {
            sb.append("\n\t\t" + items.toString() + ",");
        }
        sb.append("\b\n\t]," +
                "\ntotalAmount = ₹" + this.totalAmount +
                "}");
        return sb.toString();
    }
}

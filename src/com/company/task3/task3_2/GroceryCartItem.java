package com.company.task3.task3_2;

public class GroceryCartItem extends GroceryItem {
    float price;
    float quantity;
    public GroceryCartItem(String name,int pricePerKg){
        super(name,pricePerKg);
    }
    @Override
    public String toString(){
        return String.format("%s (₹%d X %.2fkg) = ₹%.1f",this.name,this.pricePerKg,this.quantity,this.price);
    }
    static float extractQuantity(String quantityStr)
    {
        String[] weightInString = quantityStr.split(" ");
        int[] weightInInteger = {Integer.parseInt(weightInString[0].replace("kg", "")), Integer.parseInt(weightInString[1].replace("g", ""))};
        double f = weightInInteger[0] + weightInInteger[1]*Math.pow(10, -3);
        return (float)f;
    }
    public static GroceryCartItem createNew(GroceryItem item, String quantityStr)
    {
        GroceryCartItem cartItem = new GroceryCartItem(item.name,item.pricePerKg);
        cartItem.quantity = GroceryCartItem.extractQuantity(quantityStr);
        cartItem.price= cartItem.quantity * cartItem.pricePerKg;
        return cartItem;
    }

}

package com.company.task3.task3_1;

public class SpecialProduct extends product {
    int regularPrice;
    int percentageOff;
    public SpecialProduct(String name,int price)
    {
        super(name,price);
    }
    @Override
    public String toString(){
        return String.format("Name : %s @ Rs. %d, Regular Price : Rs. %d with Percentage Off : %d", this.getName(), this.getPrice(), regularPrice, percentageOff);

    }
    static SpecialProduct applyOffOnProduct(product Product, int percentageOff){
        int discountedPrice = Product.getPrice() - Product.getPrice()*percentageOff/100;
        SpecialProduct specialProduct = new SpecialProduct(Product.getName(), discountedPrice);
        specialProduct.regularPrice = Product.getPrice();
        specialProduct.percentageOff = percentageOff;
        return specialProduct;
    }

}

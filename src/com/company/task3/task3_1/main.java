package com.company.task3.task3_1;

public class main {
    public static void main(String[] args) {
        product tv = new product("TV", 10000);
        product tv1 = new product("TV", 10000);
        product ac = new product("AC", 80000);

        System.out.println(tv.toString());
        System.out.println(tv1.toString());
        System.out.println(ac.toString());

        System.out.println("The equality of tv and tv1 is " + tv.equals(tv1));

        SpecialProduct specialProduct = SpecialProduct.applyOffOnProduct(tv, 20);
        System.out.println(specialProduct.toString());
    }
}

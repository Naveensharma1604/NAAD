package com.company.task0.introduction;
import java.util.Scanner;

public class ComputeQuotientRemainder {
    public static void main(String[] args) {
       Scanner myobj = new Scanner(System.in);
        System.out.println("Enter Divident ");
        int obj1= myobj.nextInt();
        System.out.println("Enter Divisor ");
        int obj2= myobj.nextInt();
        System.out.println("Quotient is = "+(obj1/obj2));
        System.out.println("remainder is = "+(obj1%obj2));
    }
}

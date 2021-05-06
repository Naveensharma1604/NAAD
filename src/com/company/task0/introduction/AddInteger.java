package com.company.task0.introduction;
import java.util.Scanner;
public class AddInteger {
    public static void main(String[] args) {
        Scanner myobj= new Scanner(System.in);
        System.out.println("Enter first number ");
        int obj1= myobj.nextInt();
        System.out.println("Enter Second number ");
        int obj2= myobj.nextInt();
        System.out.println("Sum of Integers = "+(obj1+obj2));
    }
}

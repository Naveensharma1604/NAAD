package com.company.task0.introduction;
import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
        System.out.println("enter first number");
        int first = obj.nextInt();
        System.out.println("enter second number");
        int second = obj.nextInt();
        System.out.println("The first number is "+first+" and Second number is "+ second);
        int temp= first;
        first = second;
        second = temp;
        System.out.println("After swapping the first number is "+first+" and Second number is "+ second);

    }
}

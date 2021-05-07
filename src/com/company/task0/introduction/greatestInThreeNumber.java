package com.company.task0.introduction;
import java.util.Scanner;
public class greatestInThreeNumber {
    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter three number");
        int a = myobj.nextInt();
        int b = myobj.nextInt();
        int c = myobj.nextInt();
        if (a > b && a > c)
            System.out.println("the largest number is " + a);
        else if (b > a && b > c)
            System.out.println("the largest number is " + b);
        else
            System.out.println("the largest number is " + c);


    }
}

package com.company.task0.introduction;
import java.util.Scanner;

public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the value of a");
        double a = myobj.nextDouble();
        System.out.println("Enter the value of b");
        double b = myobj.nextDouble();
        System.out.println("enter the value of c ");
        double c = myobj.nextDouble();


        double firstRoot = ( -b+ Math.sqrt(b*b-4*a*c))/(2*a);
        double secondRoot= ( -b- Math.sqrt(b*b-4*a*c))/(2*a);


        System.out.println("first root = "+firstRoot+ " second root = "+ secondRoot);
    }
}

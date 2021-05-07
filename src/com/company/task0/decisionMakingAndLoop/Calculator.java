package com.company.task0.decisionMakingAndLoop;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        double a = myobj.nextDouble();

        System.out.print("Please enter second number: ");
        double b = myobj.nextDouble();

        System.out.println("Enter operation to performe" +
                "  1 for addition" +
                "  2 for subtraction " +
                "  3 for multiply" +
                "  4 for divide" +
                "  5 for remainder");
        char ch = myobj.next().charAt(0);

        double total;

        switch (ch) {
            case '1': total = a + b;
                break;
            case '2': total = a - b;
                break;
            case '3': total = a * b;
                break;
            case '4': total = a / b;
                break;
            case '5': total = a % b;
                break;
            default:
                System.out.println("Please choose correct operation ");
                return;
        }
        System.out.println("The total is " + total);
    }
    }

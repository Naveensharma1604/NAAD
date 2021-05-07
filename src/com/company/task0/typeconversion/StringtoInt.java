package com.company.task0.typeconversion;
import java.util.Scanner;

public class StringtoInt {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        System.out.print("Please enter a  string: ");
        String str = myobj.nextLine();

        int data = Integer.parseInt(str);
        System.out.println("converted integer "+ data);
    }
    }


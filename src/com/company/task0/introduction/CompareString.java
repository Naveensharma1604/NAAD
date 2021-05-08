package com.company.task0.introduction;
import java.util.Scanner;
public class CompareString {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter first string");
        String a = myobj.nextLine();
        System.out.println("Enter Second string");
        String b = myobj.nextLine();
        if(a.equals(b))
            System.out.println("string is Equal");
        else
            System.out.println("String is not Equal");

    }
}

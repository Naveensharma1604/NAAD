package com.company.task0.introduction;
import java.util.Scanner;

public class AsciiValueOfChar {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the character to find ASCII Value ");
        char obj = myobj.next().charAt(0);
        System.out.println("the ASCII value of input char is : "+(int)obj);



    }
}

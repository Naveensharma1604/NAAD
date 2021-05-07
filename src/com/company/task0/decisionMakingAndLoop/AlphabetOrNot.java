package com.company.task0.decisionMakingAndLoop;
import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter a character");
        char data = myobj.next().charAt(0);
        int a= (int)data;
        if(a>=65 && a<=90 || a>=97 && a<=122)
            System.out.println("the character is alphabet");
        else
            System.out.println("not alphabet");

    }
}

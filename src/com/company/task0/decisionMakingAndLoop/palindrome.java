package com.company.task0.decisionMakingAndLoop;
import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int num = myobj.nextInt();
        int data = num;
        int rev=0;
        while(num>0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if(data==rev)
            System.out.println("The number is palindrome");
        else
            System.out.println("Not palindrome");
    }
    }


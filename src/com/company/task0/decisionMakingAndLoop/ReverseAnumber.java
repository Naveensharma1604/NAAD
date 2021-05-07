package com.company.task0.decisionMakingAndLoop;
import java.util.Scanner;
public class ReverseAnumber {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int num = myobj.nextInt();
        int rev=0;
        while(num>0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("the reverse of number is "+ rev);
    }
}

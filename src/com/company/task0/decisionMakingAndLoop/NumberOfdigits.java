package com.company.task0.decisionMakingAndLoop;
import java.util.Scanner;

public class NumberOfdigits {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter the number");
        int num = myobj.nextInt();
        int a,i=0;
        while(num>0){
            num=num/10;
            i++;
        }
        System.out.println("the number of digits are = "+ i);
    }
}

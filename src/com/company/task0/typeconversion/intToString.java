package com.company.task0.typeconversion;
import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter integer value");
        int num= myobj.nextInt();
        StringBuilder str = new StringBuilder();
        while(num>0){
            int remainder = num%10;
            str.append(remainder);
            num = num/10;
        }
        str=str.reverse();
        System.out.println("string is "+ str);
    }

}

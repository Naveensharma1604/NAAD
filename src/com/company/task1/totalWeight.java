package com.company.task1;
import java.util.Scanner;
public class totalWeight {
  static public int totalweight(String S , int[] weight){
        int a=0,b=0,c=0,d=0,e=0;
        for(int i=0;i<S.length();i++){
           char p = S.charAt(i);
            if(p=='A')
                a++;
            if(p=='B')
                b++;
            if(p=='C')
                c++;
            if(p=='D')
                d++;
            if(p=='E')
                e++;


        }

        int sum = (a * weight[0])+(b * weight[1])+(c * weight[2])+(d * weight[3])+(e * weight[4]);
        return sum;
    }
    public static void main(String[] args) {






        String s = "EEDBCCAB";
        int[] a= {4,3,2,1,5};
        int Total = totalweight(s,a);
        System.out.println("Sum is "+Total);






    }
}

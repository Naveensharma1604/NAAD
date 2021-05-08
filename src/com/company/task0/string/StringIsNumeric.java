package com.company.task0.string;

public class StringIsNumeric {
    public static void main(String[] args) {
        String s= "2w345";
        int temp=1;
                for(int i=0;i<s.length();i++) {
                    if (!((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57))
                    {
                         temp=0;
                         break;

                    }
                }
                if(temp>=1)
                    System.out.println("String is numeric");
                else
                    System.out.println("string is not numeric");
    }
}

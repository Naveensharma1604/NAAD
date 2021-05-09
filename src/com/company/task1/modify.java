package com.company.task1;
import java.util.Scanner;
public class modify {
    static public String modif(String s, String replacement){
           char[] Array = new char[10];
           for(int i=0;i<replacement.length();i+=2)
               Array[replacement.charAt(i)-48]=replacement.charAt(i+1);
        StringBuilder sb = new StringBuilder();
           for(int i=0;i<s.length();i++) {
               char ch = Array[s.charAt(i) - 48];
               sb.append(ch);
           }
           return sb.toString();

    }

    public static void main(String[] args) {

        String s= "12332145";
        String replacement = "1A2S3D4E5W";
        String modified = modif(s,replacement);
        System.out.println(modified);
    }
}

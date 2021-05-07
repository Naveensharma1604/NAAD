package com.company.task0.decisionMakingAndLoop;
import java.util.Scanner;

public class NumberOfVowelsAndConsonent {
    public static boolean isvowel(char a) {
        switch (a) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                return true;
            default:
                return false;
        }

    }

    public static boolean isconsonent(char a) {
        switch(a) {
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z':
                return true;
            default:
                return false;
        }
    }


    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter the Sentence");
        String sentence = myobj.nextLine();
        int v = 0, c = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (isvowel(sentence.charAt(i))) {
                v++;
            } else if(isconsonent(sentence.charAt(i)))
            {
                c++;
            }
        }
        System.out.println("number of vowels  "+v+"  number of consonent  "+c);

    }
}
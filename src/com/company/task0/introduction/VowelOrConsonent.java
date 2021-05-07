package com.company.task0.introduction;
import java.util.Scanner;
public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Alphabet ");
        char a= obj.next().charAt(0);
        switch(a){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            case 'A':
                System.out.println("vowel");
                break;
            case 'E':
                System.out.println("vowel");
                break;
            case 'I':
                System.out.println("vowel");
                break;
            case 'O':
                System.out.println("vowel");
                break;
            case 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonent");
        }
    }
}

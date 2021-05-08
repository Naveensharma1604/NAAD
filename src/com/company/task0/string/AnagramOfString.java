package com.company.task0.string;
import java.util.Scanner;
import java.util.Arrays;
public class AnagramOfString {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String str1 = myobj.nextLine();

        System.out.print("Enter second String: ");
        String str2 = myobj.nextLine();

        char[] Array1 = str1.toCharArray();
        char[] Array2 = str2.toCharArray();

        Arrays.sort(Array1);
        Arrays.sort(Array2);

        if (Arrays.equals(Array1, Array2))
            System.out.println(" Strings are anagram of each other.");
        else
            System.out.println("Strings are not anagram.");
    }
}

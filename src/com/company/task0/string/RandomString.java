package com.company.task0.string;
import java.util.Random;
import java.util.Scanner;
public class RandomString {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();

        Random random = new Random();
        System.out.println("Enter length of string");
        int length = myobj.nextInt();

        for(int i = 0; i < length; i++) {

            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);


            sb.append(randomChar);
        }

        String randomString = sb.toString();
        System.out.println("Random String is: " + randomString);
    }
}

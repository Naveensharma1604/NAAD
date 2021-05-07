package com.company.task0.decisionMakingAndLoop;

public class Lexicographical {
    public static void main(String[] args) {

        String[] word = { "Vinay", "Jigar", "Gunjan" ,"Naveen"};

        for(int i = 0; i < word.length-1; ++i) {
            for (int j = i + 1; j <word.length; ++j) {

                if (word[i].compareTo(word[j]) > 0) {
                    String temp = word[i];
                    word[i] = word[j];
                    word[j] = temp;
                }
            }
        }

        System.out.println("Sorted order:");

        for(int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }
    }
}

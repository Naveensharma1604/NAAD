package com.company.task0.string;
import java.util.Scanner;
public class SwichOnString {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter name of Language");
        String language = myobj.nextLine();

        switch (language) {

            case "Java":
                System.out.println(language + " is famous for enterprise applications.");
                break;

            case "JavaScript":
                System.out.println(language + " is famous for frontend and backend.");
                break;

            case "Python":
                System.out.println(language + " is famous for ML and AI.");
                break;

            default:
                System.out.println(language + " not found on record.");
                break;
        }
    }
}


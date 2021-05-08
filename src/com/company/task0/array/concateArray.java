package com.company.task0.array;
import java.util.Scanner;
public class concateArray {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int  num1= myobj.nextInt();
        int[] Array1 = new int[num1];

        System.out.println("Now enter the array");
        for (int i = 0; i < num1; i++) {
            Array1[i] = myobj.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int num2 = myobj.nextInt();
        int[] secondArray = new int[num2];

        System.out.println("Now enter the array");
        for (int i = 0; i < num2; i++) {
            secondArray[i] = myobj.nextInt();
        }

        int[] concatArray = new int[num1+num2];
        for (int i = 0; i < num1; i++) {
            concatArray[i] = Array1[i];
        }
        for (int i = num1;i < num1+num2; i++) {
            concatArray[i] = secondArray[i-num1];
        }
        System.out.print("The concatenated Array is ");

        for (int i = 0; i < num1+num2; i++) {
            System.out.print("" + concatArray[i] + ", ");
        }

    }
}

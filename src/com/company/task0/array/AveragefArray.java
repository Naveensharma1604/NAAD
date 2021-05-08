package com.company.task0.array;

public class AveragefArray {
    public static void main(String[] args) {
        double array[]= {85.3, 47.5, 49.6, 92.34, 50.5, 45.6};
        double sum=0;
        for(int i=0;i<array.length;i++)
            sum=sum+array[i];
        double average = sum/array.length;
        System.out.println("Averge is : "+average);
    }
}

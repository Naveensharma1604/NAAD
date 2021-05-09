package com.company.task3.task3_3;

public class main {
    public static void main(String[] args) {
        TouristPlace jaipur = new TouristPlace("Nahargarh","10:00Am to 5.00PM",100);
        jaipur.addFamousFor("Jaipur History").addFamousFor("Lake").addFamousFor("Mountains");

        jaipur.rate(5);
        jaipur.rate(4);
        jaipur.rate(3);

        System.out.println("Rating is " + jaipur.starRating);
    }
}

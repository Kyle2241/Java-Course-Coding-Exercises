package com.company.section4classes;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = 0;
            long years = 0;
            long remainingDays = 0;

            days = (minutes / 60) / 24;
            remainingDays = days % 365;
            years = days / 365;


            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }

    }
}

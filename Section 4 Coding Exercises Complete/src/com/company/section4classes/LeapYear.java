package com.company.section4classes;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) {
            System.out.println("The year entered was not valid. Please try again.");
            return false;
        }
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year!");
            return true;
        }
        System.out.println(year + " is not a leap year.");
        return false;
    }}

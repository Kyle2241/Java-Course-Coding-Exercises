package com.company;

import com.company.section4classes.BarkingDog;
import com.company.section4classes.LeapYear;
import com.company.section4classes.MegaBytesConverter;
import com.company.section4classes.SpeedConverter;

public class Main {

    public static void main(String[] args) {
        //You can change the values for other tests or comment out sections that are not needed.
        //I have these just as static values to show different outputs.
        //Coding Exercises from section for are 1 through 11

        //Coding Exercise 1: Speed Converter
        System.out.println("Showing Speed Converter Results: \n");
        SpeedConverter.printConversion(100);
        SpeedConverter.printConversion(0.000);
        SpeedConverter.printConversion(-5);
        System.out.println("\nEnd of Speed Converter Results");

        System.out.println("******************************");

        //Coding Exercise 2: Mega Bytes Converter
        System.out.println("Showing Mega Bytes Converter Results: \n");
        MegaBytesConverter.printMegaBytesAndKiloBytes(1056);
        MegaBytesConverter.printMegaBytesAndKiloBytes(0);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-5);
        System.out.println("\nEnd of Mega Bytes Converter Results");

        System.out.println("******************************");

        //Coding Exercise 3: Barking Dog
        System.out.println("Showing Barking Dog Results: \n");
        BarkingDog.shouldWakeUp(true, -1);
        BarkingDog.shouldWakeUp(true, 10);
        BarkingDog.shouldWakeUp(false, 7);
        BarkingDog.shouldWakeUp(true, 7);
        System.out.println("\nEnd of Barking Dog Results");

        System.out.println("******************************");

        //Coding Exercise 4: Leap Year Calculator
        System.out.println("Showing Leap Year Calculator Results: \n");
        LeapYear.isLeapYear(-5);
        LeapYear.isLeapYear(1997);
        LeapYear.isLeapYear(2020);
        System.out.println("\nEnd of Leap Year Calculator Results");

        System.out.println("******************************");

        //Coding Exercise 5: Decimal Comparator
        System.out.println("Showing Decimal Comparator Results: \n");


        System.out.println("\nEnd of Decimal Comparator Results");

        System.out.println("******************************");

        //Coding Exercise 6: Equal Sum Checker
        System.out.println("Showing Equal Sum Checker Results: \n");


        System.out.println("\nEnd of Equal Sum Checker Results");

        System.out.println("******************************");

        //Coding Exercise 7: Teen Number Checker
        System.out.println("Showing Teen Number Checker Results: \n");


        System.out.println("\nEnd of Teen Number Checker Results");

        System.out.println("******************************");

        //Coding Exercise 8: Area Calculator
        System.out.println("Showing Area Calculator Results: \n");


        System.out.println("\nEnd of Area Calculator Results");

        System.out.println("******************************");

        //Coding Exercise 9: Minutes to Years and Days Calculator
        System.out.println("Showing Minutes to Years and Days Calculator Results: \n");


        System.out.println("\nEnd of Minutes to Years and Days Calculator Results");

        System.out.println("******************************");

        //Coding Exercise 10: Equality Printer
        System.out.println("Showing Equality Printer Results: \n");


        System.out.println("\nEnd of Equality Printer Results");

        System.out.println("******************************");

        //Coding Exercise 11: Playing Cat
        System.out.println("Showing Playing Cat Results: \n");


        System.out.println("\nEnd of Playing Cat Results");

        System.out.println("******************************");
        System.out.println("This is the end of the Section 4 Coding Exercise results!");
    }
}

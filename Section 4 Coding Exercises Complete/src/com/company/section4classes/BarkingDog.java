package com.company.section4classes;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if ((hourOfDay < 0) || (hourOfDay > 24)) {
            System.out.println("An invalid time was entered. Please enter a time between 0 and 24.");
            return false;
        }
        if (((hourOfDay >= 8) && (hourOfDay <= 22))) {
            System.out.println("It is between 8am and 10pm. The dog is allowed to bark.");
            return false;
        }
        if (!barking) {
            System.out.println("The dog is not barking.");
            return false;
        }
        if (((barking) && (hourOfDay < 8)) || (hourOfDay > 22)) {
                System.out.println("Wake up! The dog is barking!");
            }

        return true;
    }
}

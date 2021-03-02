package com.company.section4classes;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megaBytes = 0;
        int remainKiloBytes = 0;

        megaBytes = kiloBytes / 1024;
        remainKiloBytes = kiloBytes % 1024;

        if (kiloBytes < 0){
            System.out.println("You entered a negative number. Please enter a valid positive integer.");
        }
        else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainKiloBytes + " KB");
        }
    }
}


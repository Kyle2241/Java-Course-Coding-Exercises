package com.company.section4classes;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2){
        if(d1<0 && d2 >0 || d1>0 && d2<0){
            return false;
        }
        return ((long)(Math.floor(Math.abs(d1*1000)))==(long)(Math.floor(Math.abs(d2*1000))));
    }
}

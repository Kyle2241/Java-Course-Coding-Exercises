package com.company.section4classes;

public class AreaCalculator {
    public static double area (double radius){

        if (radius < 0) {
            return -1.0;
        }
        double circle_area = radius * radius * Math.PI;
        return circle_area;

    }
    public static double area (double x, double y){
        if (x < 0 || y < 0) {
            return -1.0;
        }
        double rectangle_area = x * y;
        return rectangle_area;
    }
}

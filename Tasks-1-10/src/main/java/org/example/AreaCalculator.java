package org.example;

import java.lang.Math;

public class AreaCalculator {
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateSquareArea(double sideLength) {
        return Math.pow(sideLength, 2);
    }

    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }
}

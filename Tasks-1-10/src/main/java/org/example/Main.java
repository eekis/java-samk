package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1 - Euclidean distance between (0,0) and (0,3).
        System.out.println("\nTask 1:");
        System.out.println(
            EuclideanDistance.calculateEuclideanDistance(0, 0, 0, 3)
        );


        // Task 2 - Christmas tree with a height of 5.
        System.out.println("\nTask 2:");
        ChristmasTree.printChristmasTree(5);


        // Task 3 - Calculating the area of a circle, a square and a rectangle.
        System.out.println("\nTask 3:");
        System.out.println("  Circle, radius 2: " + AreaCalculator.calculateCircleArea(5));
        System.out.println("  Square, side length 4: " + AreaCalculator.calculateSquareArea(4));
        System.out.println("  Rectangle, width 4 height 2: " + AreaCalculator.calculateRectangleArea(4, 2));


        // Task 4 - Finding the index of the largest value in a 2D-matrix.
        System.out.println("\nTask 4:");
        int[][] t4matrix = {
            {1, 5, 7},
            {9, 3, 1},
            {0, 1, 1}
        };
        System.out.println("Index of largest value: "
            + Arrays.toString(TwoDimensionalMatrix.getIndexOfLargestValue(t4matrix))
        );


        // Task 5 - Sorting an int[] from smallest to largest.
        System.out.println("\nTask 5:");
        int[] t5Array = {8, 3, 2, 7};
        System.out.println(Arrays.toString(ArraySorter.sortSmallestToLargest(t5Array)));


        // Task 6 - Checking if a string is a palindrome.
        System.out.println("\nTask 6:");
        String t6string = "Saippuakauppias";
        if (PalindromeChecker.isPalindrome(t6string)) {
            System.out.println(t6string + " is a palindrome.");
        } else {
            System.out.println(t6string + " is NOT a palindrome.");
        }


        // Task 7 - Get the n:th integer of the Fibonacci sequence.
        System.out.println("\nTask 7:");
        int t7n = 4;
        System.out.println(FibonacciCalculator.getNthInteger(t7n));

        // Task 8 - Get prime numbers between n and n/2.
        System.out.println("\nTask 8:");
        int t8n = 10;
        System.out.println(PrimeNumberCalculator.getPrimesBetweenNAndHalfN(t8n));

        // Task 9 - Convert seconds to HH:MM:SS.
        System.out.println("\nTask 8:");
        int t9n = 3661;
        System.out.println(TimeFormatter.secondsToHHMMSS(t9n));
    }

}
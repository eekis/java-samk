package org.example;

public class FibonacciCalculator {

    public static int getNthInteger(int n) {
        int x = 0;
        int y = 1;
        int z;
        for (int i = 0; i < n-1; i++) {
            z = y + x;
            x = y;
            y = z;
        }
        return y;
    }
}

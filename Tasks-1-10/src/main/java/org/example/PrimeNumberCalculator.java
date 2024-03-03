package org.example;

import java.util.ArrayList;

public class PrimeNumberCalculator {
    public static ArrayList<Integer> getPrimesBetweenNAndHalfN(int n) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int halfN = Math.round((float) n / 2);

        for (int i = halfN; i < n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}

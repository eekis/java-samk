package org.example;

import java.util.Arrays;

public class ArraySorter {
    public static int[] sortSmallestToLargest(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        do {
            for (int i = 0; i < result.length - 1; i++) {
                if (result[i] > result[i + 1]) {
                    int x = result[i];
                    int y = result[i + 1];
                    result[i] = y;
                    result[i + 1] = x;
                }
            }
        } while(!isSorted(result));
        return result;
    }

    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }
}

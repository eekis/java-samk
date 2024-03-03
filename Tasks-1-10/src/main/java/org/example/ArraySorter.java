package org.example;

public class ArraySorter {
    public static int[] sortIntArraySmallestToLargest(int[] input) {
        int[] result = input;
        int length = result.length;
        for (int i = 0; i < length-1; i++) {
            if (result[i] > result[i+1]) {
                int x = result[i];
                int y = result[i+1];
                result[i] = y;
                result[i+1] = x;
            }
        }
        return result;

        boolean isSorted(int[] )
    }
}

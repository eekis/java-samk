package org.example;


public class T11_LargestSumFinder {
    public static int findLargestSum(int[] array) {
        if (array.length < 3) throw new IllegalArgumentException("Array length must be >= 3");

        int result = array[0] + array[1] + array[2];
        int current = result;

        for (int i = 3; i < array.length; i++) {
            current = current - array[i - 3] + array[i];

            if (current > result) {
                result = current;
            }
        }

        return result;
    }
}

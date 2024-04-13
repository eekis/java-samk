package org.example;

public class T16_MissingIntFinder {
    public static int findMissingInt(int[] array) {
        int result = 0;

        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] - array[i - 1] != 1) {
                result = array[i] - 1;
            }
        }

        return result;
    }
}

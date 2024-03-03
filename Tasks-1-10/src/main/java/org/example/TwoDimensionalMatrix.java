package org.example;

public class TwoDimensionalMatrix {
    public static int[] getIndexOfLargestValue(int[][] matrix) {
        int[] index = {0, 0};
        int largest = 0;

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                    index[0] = i;
                    index[1] = j;
                }
            }
        }

        return index;
    }
}

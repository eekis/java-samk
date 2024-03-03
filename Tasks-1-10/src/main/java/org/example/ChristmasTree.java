package org.example;

public class ChristmasTree {
    public static void printChristmasTree(int height) {
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < (height - i - 1); j++) {
                line.append(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                line.append("*");
            }
            System.out.println(line);
        }
    }
}

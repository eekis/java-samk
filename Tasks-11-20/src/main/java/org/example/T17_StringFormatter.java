package org.example;


public class T17_StringFormatter {
    public static String reverse (String string) {
        char[] chars = string.toCharArray();
        char[] reversed = new char[chars.length];

        int count = chars.length - 1;

        for (char aChar : chars) {
            reversed[count] = aChar;
            count--;
        }

        return new String(reversed);
    }
}

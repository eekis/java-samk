package org.example;

import java.util.Arrays;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        char[] chars = input
                        .replaceAll("\\s", "")
                        .toLowerCase()
                        .toCharArray();

        char[] charsReversed = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            charsReversed[chars.length - 1 - i] = chars[i];
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != charsReversed[i]) {
                return false;
            }
        }

        return true;
    }
}

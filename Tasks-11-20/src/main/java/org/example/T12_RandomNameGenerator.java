package org.example;

import java.util.Random;

public class T12_RandomNameGenerator {

    private static final String[] firstNames = {"Donald", "Daisy", "Scrooge", "Mickey", "Minney"};
    private static final String[] lastNames = {"Duck", "McDuck", "Mouse"};

    public static String genRandomName() {
        Random rand = new Random();
        return firstNames[rand.nextInt(firstNames.length)] + " " + lastNames[rand.nextInt(lastNames.length)];
    }
}

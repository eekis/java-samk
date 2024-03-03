package org.example;

import java.util.HashMap;
import java.util.ArrayList;

public class RandomNumberGenerator {
    public static HashMap<String, ArrayList<Integer>> generateNumbersBetweenXY(int min, int max, int count) {
        HashMap<String, ArrayList<Integer>> numbers = new HashMap<String, ArrayList<Integer>>();

        numbers.put("negative", new ArrayList<Integer>());
        numbers.put("positive", new ArrayList<Integer>());
        numbers.put("zero", new ArrayList<Integer>());

        for (int i = 0; i < count; i++) {
            int n = (int)(Math.random() * (max - min + 1)) + min;
            if (n < 0) {
                ArrayList<Integer> list = numbers.get("negative");
                list.add(n);
                numbers.put("negative", list);
            } else if (n > 0) {
                ArrayList<Integer> list = numbers.get("positive");
                list.add(n);
                numbers.put("positive", list);
            } else {
                ArrayList<Integer> list = numbers.get("zero");
                list.add(n);
                numbers.put("zero", list);
            }
        }

        return numbers;
    }
}

package org.example;

public class TimeFormatter {
    public static String secondsToHHMMSS(int n) {
        int hours = n / 60 / 60;
        int minutes =  n / 60 % 60;
        int seconds = n % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

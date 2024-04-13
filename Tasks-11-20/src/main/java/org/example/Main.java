package org.example;

import java.io.File;

import org.example.T14_bank.Bank;
import org.example.T14_bank.Account;

import org.example.T18_filehandler.Text;
import org.example.T18_filehandler.Audio;

import org.example.T20_tasks.Task1;
import org.example.T20_tasks.Task2;

public class Main {
    public static void main(String[] args) {

        // Task 11 - Largest sum of three consecutive numbers.
        System.out.println("\nTask 11:");
        int[] t11Array = {9, 8, 32, -2, 1};
        System.out.println(
            T11_LargestSumFinder.findLargestSum(t11Array)
        );


        // Task 12 - Generate random name.
        System.out.println("\nTask 12:");
        System.out.println(
            T12_RandomNameGenerator.genRandomName()
        );


        // Task 13 - Get folder size.
        System.out.println("\nTask 13:");
        String t13Path = "C:\\temp";
        System.out.println(
            T13_FolderSizeCalculator.getFolderSize(new File(t13Path))
        );


        // Task 14 - Bank.
        System.out.println("\nTask 14:");
        Bank bank = new Bank();
        Account account = new Account("John Doe");
        bank.addAccount(account);
        account.withdraw(20);
        account.deposit(40);
        account.getBalance();
        bank.getAccountInfo(account.getNumber());
        bank.removeAccount(account.getNumber());


        // Task 15 - Singleton music player.
        System.out.println("\nTask 15:");
        T15_MusicPlayer playerOne = T15_MusicPlayer.getInstance();
        T15_MusicPlayer playerTwo = T15_MusicPlayer.getInstance();
        String t15Track = "Sabaton - Wolfpack";

        System.out.println("Player one:");
        playerOne.setTrack(t15Track);
        playerOne.playTrack();

        System.out.println("Player two:");
        playerTwo.playTrack();


        // Task 16 - Find missing integer.
        System.out.println("\nTask 16:");
        int[] t16ArrayOne = {1, 2, 3, 5};
        int[] t16ArrayTwo = {1, 2, 3, 4, 5, 6, 8, 9, 10, 11};
        System.out.println(
            T16_MissingIntFinder.findMissingInt(t16ArrayOne)
        );
        System.out.println(
            T16_MissingIntFinder.findMissingInt(t16ArrayTwo)
        );


        // Task 17 - Reverse a string.
        System.out.println("\nTask 17:");
        String t17String = "Atom";
        System.out.println(
            T17_StringFormatter.reverse(t17String)
        );


        // Task 18 - File handler.
        System.out.println("\nTask 18:");
        Text text = new Text("C:\\text.txt");
        text.open();
        text.close();
        Audio audio = new Audio("C:\\audio.mp3");
        audio.open();
        audio.close();


        // Task 19 - Custom stack.
        System.out.println("\nTask 19:");
        T19_CustomStack<String> stack = new T19_CustomStack<>();

        System.out.println("Size: " + stack.size());
        System.out.println("Empty?: " + stack.isEmpty());

        stack.push("Dog");
        stack.push("Cat");
        System.out.println("Pushed 'Dog' and 'Cat'");
        System.out.println("Size: " + stack.size());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Size: " + stack.size());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Size: " + stack.size());
        System.out.println("Empty?: " + stack.isEmpty());


        // Task 20 - Task threading.
        System.out.println("\nTask 20:");

        Thread t1 = new Thread(new Task1());
        Thread t2 = new Thread(new Task2());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
package com.company.lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        getOutputOfUniqueWordsFromAnArrayOfWordsAndCounting();

        playingPhoneBookApplication();

    }

    private static void playingPhoneBookApplication() {
        PhoneDirectory phoneDirectory= new PhoneDirectory();
        phoneDirectory.add("Popov","89823654215");
        phoneDirectory.add("Gagarin","89821933045");
        phoneDirectory.add("Ivanov","89225456235");
        phoneDirectory.add("Petrov","89753652121");
        phoneDirectory.add("Petrov","89225554433");
        phoneDirectory.add("Ivanov","89025487777");

        System.out.println("Popov, tel.№ " +phoneDirectory.get("Popov"));
        System.out.println("Ivanov, tel.№ " +phoneDirectory.get("Ivanov"));
        System.out.println("Gagarin, tel.№ " +phoneDirectory.get("Gagarin"));
        System.out.println("Petrov, tel.№ " +phoneDirectory.get("Petrov"));
    }

    private static void getOutputOfUniqueWordsFromAnArrayOfWordsAndCounting() {
        int count=0;
        String[] arraysOfWord =new String[]{"Dog","Cat","Worm","Chicken","Pig","Cat","Alligator","Worm","Cat","Pig","Tiger","Cat","Chicken","Horse","Sloth","Horse"};
        Set<String> arraysSet = new HashSet<>(Arrays.asList(arraysOfWord));
        for (String ignored : arraysSet) {
            count++;
        }
        System.out.println("List of unique words: "+arraysSet);
        System.out.println("Counting unique words = "+ count);
    }
}

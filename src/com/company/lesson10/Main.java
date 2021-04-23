package com.company.lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        outputOfUniqueWordsFromAnArrayOfWordsAndCounting();

    }

    private static void outputOfUniqueWordsFromAnArrayOfWordsAndCounting() {
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

package com.company.lesson10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int count=0;
        Set<String> set=new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Worm");
        set.add("Pig");
        set.add("Tiger");
        set.add("Pig");
        set.add("Chicken");
        set.add("Horse");
        set.add("Sloth");
        set.add("Cat");
        Iterator<String> iter= set.iterator();
        while (iter.hasNext()){
            iter.next();
            count++;

        }
        System.out.println("List of unique words: "+set);
        System.out.println("Counting unique words = "+ count);


    }
}

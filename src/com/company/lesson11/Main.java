package com.company.lesson11;


import java.util.ArrayList;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        playingTaskNumberOneAndTwoLessonOfPracticTenExampleTypeInteger();

        playingTaskNumberOneAndTwoLessonOfPracticTenExampleTypeString();


    }

    private static void playingTaskNumberOneAndTwoLessonOfPracticTenExampleTypeString() {
        TaskOneAndTwo<String> arrString=new TaskOneAndTwo<>("1","3","fishhook","$$#");
        arrString.getArray();
        arrString.changingElemArray(0,3);
        arrString.getArray();
        List<String> listOfStr=new ArrayList<>();
        arrString.arrToArrList(listOfStr);
        listOfStr.add("addTest");
        listOfStr.add(2,"testTwo");
        listOfStr.remove(1);
        System.out.println(listOfStr);
    }

    private static void playingTaskNumberOneAndTwoLessonOfPracticTenExampleTypeInteger() {
        TaskOneAndTwo<Integer> arraysInt=new TaskOneAndTwo<>(1,2,3,4,6,8,9);
        arraysInt.getArray();
        arraysInt.changingElemArray(0,3);
        arraysInt.getArray();
        List<Integer> listOfT =new ArrayList<>();
        arraysInt.arrToArrList(listOfT);
        listOfT.add(15);
        listOfT.add(25);
        System.out.println(listOfT);
    }


}

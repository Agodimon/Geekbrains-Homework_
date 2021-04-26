package com.company.lesson11;


import java.util.ArrayList;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        playingTaskNumberOneAndTwoLessonOfPracticeTenExampleTypeInteger();

        playingTaskNumberOneAndTwoLessonOfPracticeTenExampleTypeString();

        getTestOfTaskThreeThemeFruitBoxOrangeAndBoxApple();


    }

    private static void getTestOfTaskThreeThemeFruitBoxOrangeAndBoxApple() {
        Box<Apple> boxApple=new Box<>();
        Box<Orange> boxOrange=new Box<>();
        Box<Apple> boxAppleTwo=new Box<>();
        Box<Orange> boxOrangeTwo=new Box<>();

        boxApple.addFruit(new Apple(),15);

        boxAppleTwo.addFruit(new Apple(), 16);


        boxOrange.addFruit(new Orange(),10);

        boxOrangeTwo.addFruit(new Orange(),52);


        System.out.println(boxApple.getWeight());
        System.out.println(boxOrange.getWeight());
        System.out.println(boxAppleTwo.getWeight());
        System.out.println(boxOrangeTwo.getWeight());

        System.out.println(boxApple.compare(boxOrange));

        boxApple.pourTo(boxAppleTwo);
        System.out.println(boxApple.getWeight());
        System.out.println(boxAppleTwo.getWeight());
        System.out.println(boxApple.compare(boxAppleTwo));

        boxApple.addFruit(new Apple(),31);
        System.out.println(boxApple.getWeight());
        System.out.println(boxAppleTwo.getWeight());
        System.out.println(boxApple.compare(boxAppleTwo));
    }

    private static void playingTaskNumberOneAndTwoLessonOfPracticeTenExampleTypeString() {
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

    private static void playingTaskNumberOneAndTwoLessonOfPracticeTenExampleTypeInteger() {
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

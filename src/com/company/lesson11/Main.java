package com.company.lesson11;

import jdk.jfr.internal.Type;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    BoxArr<Integer> arraysInt=new BoxArr<>(1,2,3,4,6,8,9);
      arraysInt.getArray();

        arraysInt.changingElemArray(0,3);

        arraysInt.getArray();
        System.out.println(arraysInt.arrToArrList());
        BoxArr<String> arrString=new BoxArr<>("1","3","fishhook","$$#");
        arrString.getArray();
        arrString.changingElemArray(0,3);
        arrString.getArray();


    }


}

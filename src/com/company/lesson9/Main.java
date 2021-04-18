package com.company.lesson9;

public class Main {
    public static void main(String args[]) {

        String[][] array={{" 1"," 1"," 1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        int sumIndexArray=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                int s = Integer.parseInt(array[i][j].trim());
                System.out.print(" "+s+" ");
                sumIndexArray++;
            }
            System.out.println();
        }
        System.out.println("Сумма индексов массива = " + sumIndexArray);
    }
}

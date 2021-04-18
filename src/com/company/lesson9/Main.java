package com.company.lesson9;

import java.util.Arrays;

public class Main {
    public static final int rowSize=4;
    public static final int columnSize=4;

    public static void main(String[] args) {


        reproduceEventOneAllWorking();

        reproduceEventTwoMyArrayDataE();

        reproduceEventThreeMyArraySizeE();

    }

    private static void reproduceEventThreeMyArraySizeE() {
        String[][] array= new String[][]{{" 1", " 1", " 1"," 1"," 1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            try {
                convertingIndexOfArrayToIntAndSumming(array);
            } catch (MyArrayDataException e) {
                System.out.println("Ошибка ввода данных в массив.Должны быть только числа!!! Проверьте ячейку: " + "[" + e.i + "]" + "x" + "[" + e.j + "]");
            }
        }catch (MyArraySizeException e){
            System.out.println(e);
        }
    }
    private static void reproduceEventTwoMyArrayDataE() {
        String[][] array= new String[][]{{" 1", " 1", " 1"," P"}, {"1", "1", "$", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            try {
                convertingIndexOfArrayToIntAndSumming(array);
            } catch (MyArrayDataException e) {
                System.out.println("Ошибка ввода данных в массив.Должны быть только числа!!! Проверьте ячейку: " + "[" + e.i + "]" + "x" + "[" + e.j + "]");
            }
        }catch (MyArraySizeException e){
            System.out.println(e);
        }
    }
    private static void reproduceEventOneAllWorking() {
        String[][] array= new String[][]{{" 1", " 1", " 1"," 1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            try {
                convertingIndexOfArrayToIntAndSumming(array);
            } catch (MyArrayDataException e) {
                System.out.println("Ошибка ввода данных в массив.Должны быть только числа!!! Проверьте ячейку: " + "[" + e.i + "]" + "x" + "[" + e.j + "]");
            }
        }catch (MyArraySizeException e){
            System.out.println(e);
        }
    }
    private static void convertingIndexOfArrayToIntAndSumming(String[][] array) throws MyArrayDataException, MyArraySizeException {

        if (array[0].length!=columnSize||array[1].length!=rowSize||array[2].length!=rowSize||array[3].length!=rowSize){
          throw new MyArraySizeException("Неверно введено колличество столбцов в массиве. В массиве должно быть 4 столбца");
        }
        if (array.length!=rowSize){
            throw new MyArraySizeException("Неверно введено колличество строк в массиве. В массиве должно быть 4 строки");
        }
        System.out.println(Arrays.deepToString(array));

        int sumIndexArray=0;

        for (int i = 0; i < rowSize; i++) {

            for (int j = 0; j < columnSize; j++) {

                try {
                    int s = Integer.parseInt(array[i][j].trim());

                    System.out.print(" " + s + " ");
                    sumIndexArray++;
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }
            }
            System.out.println();
        }System.out.println("Сумма индексов массива = " + sumIndexArray);
    }
}

package com.company.lesson1;

public class Main {


    public static void main(String[] args) {
        enumeration(10, 100.25f, true, (byte) 125, 1025L, 145.126, '3', "Тут различные строки и символы");
        doCalcMethod(10f, 10.25f, 45.6f, 5f);
        doChekRange(15, 16);
        numberPositiveNegative(-100);
        chekBooleanIntegerNumber(1768);
        name("Андрей");
        Year(2000);
    }



    public static void enumeration(int a, float b, boolean c, byte d, long efg, double efc, char simvol, String string_text) {

        String text_ = "\n \n Задание  №1 \n Переменные всех пройденных типов данных: " + "\n Int = " + a + "\n float= " + b + "\n boolean = "
                + c + "\n byte = " + d + "\n long = " + efg + "\n double = " + efc + "\n char = " + simvol +
                "\n String(текст,набор символов) = " + string_text;
        System.out.println(text_);

    }



    public static void doCalcMethod(float a, float b, float c, float d) {
        float doCalc = a * (b + (c / d));
        System.out.println("\n \n Задание №2 \n Выражение: a*(b+(c/d) = " + doCalc + "\n где а = " + a + "\n b= " + b +
                "\n c = " + c + "\n d = " + d);
    }


    public static void doChekRange(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 20) {
            System.out.println("\n \n Задание №3 \n Сумма чисел " + x + " и " + y + " = " + sum + " . Результат суммы в диапазоне от 10 до 20. ");

        } else {
            System.out.println("\n \n Задание №3 \n Сумма чисел " + x + " и " + y + " = " + sum + " . Результат суммы не в диапазоне от 10 до 20 . ");
        }
    }


    public static void numberPositiveNegative(int x) {
        if (x >= 0) {
            System.out.println(" \n \n Задание №4 \n Число = " + x + "= положительное. ");
        } else {
            System.out.println(" \n \n Задание №4  \n Число " + x + " = отрицательное. ");
        }
    }

    public static void chekBooleanIntegerNumber(int x) {
        if (x >= 0)
            System.out.println(" \n \n Задание №5 \n Число = " + x + "= положительное.  \n Результат проверки = " + false);
        else {
            System.out.println(" \n \n Задание №5 \n Число " + x + " = отрицательное. \n Результат проверки = " + true);
        }
    }


    public static void name(String x) {
        System.out.println(" \n \n Задание №6 \n Привет," + x);

    }

    public static void Year(int x) {
        int y = x % 4;
        int z = x % 100;
        int m = x % 400;

        System.out.println("\n \n \n Задание № 7 \n ");
        String ves;
        if ((y == 0 && z != 0) || (y == 0 && m == 0)) {
            ves = " год является ВЕСОКОСНЫМ.";

        } else {
            ves = " год НЕ является ВЕСОКОСНЫМ. ";
        }
        System.out.println(x + ves);

    }

}



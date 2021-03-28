package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int min_enter =0;
    public static int max_enter =9;



    public static void main(String[] args) {
        enterNumber_();
        printOutRandomNumberInt_min_to_max();
    }

    public static int enterNumber_() {
        int enterNum;
        do {
            System.out.println("Введите число от 0 до 9: ");
            Scanner enterNumber= new Scanner(System.in);
            enterNum=enterNumber.nextInt();
            System.out.println(enterNum);

        }while (enterNum< min_enter || enterNum> max_enter);
        System.out.println("Введёное число : "+enterNum+" принято.");
        return enterNum;
    }

    public static int printOutRandomNumberInt_min_to_max() {
     Random randomNum_minMax=new Random();
     int randomNum=randomNum_minMax.nextInt(10);
        System.out.println(" \n Случайное число от 0 до 9: "+randomNum);
        return randomNum;
    }

}


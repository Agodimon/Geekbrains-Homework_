package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int x=0;



    public static void main(String[] args) {
        enterNumber_();
        printOutRandomNumberInt_0_to_9();
    }

    public static int enterNumber_() {
        int enterNum;
        do {
            System.out.println("Введите число от 0 до 9: ");
            Scanner enterNumber= new Scanner(System.in);
            enterNum=enterNumber.nextInt();
            System.out.println(enterNum);

        }while (enterNum<0 || enterNum>9 );
        System.out.println("Введёное число : "+enterNum+" принято.");
        return enterNum;
    }

    public static int printOutRandomNumberInt_0_to_9() {
     Random randomNum_0to9=new Random();
     int randomNum=randomNum_0to9.nextInt(10);
        System.out.println(" \n Случайное число от 0 до 9: "+randomNum);
        return randomNum;
    }

}


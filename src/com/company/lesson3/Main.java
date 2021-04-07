package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int minEnter =0;
    public static int maxEnter =9;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        do {
            int randNum= printOutRandomNumberIntMinToMax();
            int attempt=3;
        do {
            int enterNum=enterNumber_();
            if (enterNum==randNum){
                System.out.println("Вы отгадали!!!!!!!!!!!!");
                break;
            }
            else if ( enterNum>randNum){
                attempt--;
                System.out.println("Вы ввели слишком большое число. У вас осталось попыток = " + attempt);
            } else {
                attempt--;
                System.out.println("Вы ввели слишком маленькое число. У вас осталось попыток = " + attempt);
            }
        } while ( attempt!=0);
        if (attempt==0){
            System.out.println("Вы проиграли. Загаданное число было = "+ randNum);
        }
            System.out.println("Хотите ли вы поиграть заново? Y/N");
        } while (scanner.next().equalsIgnoreCase("Y"));
        scanner.close();
    }
    public static int enterNumber_() {
        int enterNum;
        Scanner enterNumber= new Scanner(System.in);
        do {
            System.out.println("Введите число от 0 до 9: ");

            enterNum=enterNumber.nextInt();
            System.out.println(enterNum);


        }while (enterNum< minEnter || enterNum> maxEnter);
        System.out.println("Введёное число : "+enterNum+" принято.");

        return enterNum;

    }
    public static int printOutRandomNumberIntMinToMax() {
     Random randomNum_minMax=new Random();
        return randomNum_minMax.nextInt(10);
    }
}


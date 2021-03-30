package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GussWordGame {

    public static Random randWord= new Random();
    public static Scanner sc =new Scanner(System.in);
    public static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        String guessWord = words[randWord.nextInt(words.length)];
        while (true){
            System.out.println("Напиши слово: ");
            String  userAnswer = sc.nextLine();
             if (userAnswer.equalsIgnoreCase(guessWord)){
                 System.out.println("Вы отгадали!");
                 break;
             }else {
                 StringBuilder resultStr = getPartOfAnswer(userAnswer, guessWord);
                 System.out.println("Попробуй ещё");
                 System.out.println(resultStr.toString());
             }

        }
sc.close();
    }


    public static StringBuilder getPartOfAnswer(String userAnswer, String guessWords) {
        char[] chars = userAnswer.toCharArray();
        StringBuilder resultStr=new StringBuilder();
            for (int i=0;i< chars.length;i++){
                if (i<guessWords.length()){
                    if (chars[i]==guessWords.charAt(i)){
                        resultStr.append(chars[i]);
                     }else{
                     resultStr.append("#");
                    }
                }
            }
    resultStr.append("################");
            return resultStr;
    }

}

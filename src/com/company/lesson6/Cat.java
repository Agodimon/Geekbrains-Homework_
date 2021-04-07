package com.company.lesson6;

public class Cat extends Animal {
    public static int counterCat;
    public Cat(String name, String color) {
        super(name, color);
        counter++;
        counterCat++;

    }


   @Override
    public void swim(int length) {

            System.out.println(" Коты плавать не могут ");

    }

    @Override
    public void run (int length) {
        if (length<=200){
            System.out.println(getColor()+" кот " +getName()+" пробежал " + length+" метров. ");
        }else {
            System.out.println(" Коты могут пробежать до 200 метров. " );
        }

    }
    public static void getCounterCat(){

        System.out.println(" Котов создано = " +  counterCat);
    }

}

package com.company.lesson6;

public class Dog extends Animal{
    public static int counterDog;
    public Dog(String name, String color) {
        super(name, color);
        counter++;
        counterDog++;
    }
    @Override
    public void swim(int length) {
        if (length<=10) {
            System.out.println(getColor()+" собака "  +getName()+" проплыл " + length+" метров. ");
        }else {
            System.out.println(" Собаки проплыть могут до 10 метров. ");
        }
    }

    @Override
    public void run (int length) {
        if (length<=500){
            System.out.println(getColor()+" собака " +getName()+" пробежал " + length+" метров. ");
        }else {
            System.out.println(" Собаки могут пробежать до 500 метров. " );
        }
    }
    public static void getCounterDog(){

        System.out.println(" Собак создано = " +  counterDog);
    }
}

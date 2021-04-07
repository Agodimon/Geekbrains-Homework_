package com.company.lesson6;

public class Animal {
    protected String name;
    protected String color;
    public static int counter;


    public Animal(String name, String color) {
        setName(name);
        setColor(color);

    }
    public void swim(int length) {

        System.out.println(getColor() +getName()+" проплыл " + length+" метров. ");

    }

    public void run (int length) {

        System.out.println(getColor() +getName()+" пробежал " + length+" метров. ");

    }


    protected String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    protected String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    public static void getCounterAnimals() {

        System.out.println(" Животных создано = " +  counter);
    }
}

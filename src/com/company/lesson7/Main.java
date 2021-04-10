package com.company.lesson7;

public class Main {
    public static void main(String[] args) {
    Cat cat = new Cat("Barsik",45);
    Plate plate=new Plate(50);
    plate.info();
    cat.eat(plate);
    plate.info();

    }
}

package com.company.lesson6;

public class Main {
    public static void main(String[] args) {

        Animal[] animals= new Animal[5];
        animals[0]= new Cat(" Felix ","Blue");
        animals[1]=new Dog("Bob","Red");
        animals[2]= new Cat(" Jerry ","Black");
        animals[3]=new Dog("Robbert","Yellow");
        animals[4]=new Dog("Tom","Green");

        animals[0].swim(200);
        animals[0].run(100);
        animals[1].swim(200);
        animals[1].run(100);
        animals[2].swim(200);
        animals[2].run(100);
        animals[3].swim(500);
        animals[3].run(700);

        Animal.getCounterAnimals();
        Cat.getCounterCat();
        Dog.getCounterDog();
    }

}

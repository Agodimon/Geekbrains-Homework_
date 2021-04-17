package com.company.lesson7;

public class Main {

    public static void main(String[] args) {
        int s=0;
        int hunger=0;

        Cat[] cats = getCats();

        Plate plate=new Plate(900);

        plate.info();
        feedAllTheCats(cats, plate, s, hunger);
        plate.info();
        plate.addFood(2000);
        plate.info();
        feedAllTheCats(cats, plate, s, hunger);

    }



    private static void feedAllTheCats(Cat[] cats, Plate plate, int s, int hunger) {
        for (Cat cat : cats) {
            cat.eat(plate);
            if (cat.isSatiety()) {
                s++;
            } else {
                hunger++;
            }
        }
        if (s == cats.length){
            System.out.println("Все коты сыты.");
        }else {
            System.out.println("В тарелке не осталось еды.  "  + " Количество котов оставшихся голодными: " + hunger );
        }
    }

    private static Cat[] getCats() {
        Cat[] cats=new Cat[5];
        cats[0] = new Cat("Baris",50);
        cats[1] = new Cat("Maurizio",100);
        cats[2] = new Cat("Tom",1150);
        cats[3] = new Cat("Sam",20);
        cats[4] = new Cat("Rodger",1000);
        return cats;
    }
}

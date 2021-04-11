package com.company.lesson7;

public class Cat {
    private final String name;
    public int appetite;
    private boolean satiety=false;




    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;


    }

    public void eat(Plate p){
        int sat = appetite-p.getFood();
        if ( sat<=0) {
            p.decreaseFood(appetite);
            setSatiety(true);

        }else{
            System.out.println("В этой тарелке недостаточно еды для удовлетворения голода. Кот "+ name +" есть не будет. " );
            setSatiety(false);

        }
    }
    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean isSatiety() {

        return satiety;
    }
}

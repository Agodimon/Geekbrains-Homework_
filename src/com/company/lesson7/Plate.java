package com.company.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Plate: " + food);
    }

    public void decreaseFood(int n){
        if (n<food){
            food-=n;
        }  else{
            food=0;
        }


    }
}

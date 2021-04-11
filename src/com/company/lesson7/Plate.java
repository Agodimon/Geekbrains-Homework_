package com.company.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        setFood(food);
    }

    public void info(){
        System.out.println("Plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int n){
        setFood(n+this.food);

}


    public void decreaseFood(int n){
        if (n<food){
            food-=n;
        }  else{
            food=0;
        }

    }
}

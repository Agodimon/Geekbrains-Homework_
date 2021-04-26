package com.company.lesson11;


import java.util.ArrayList;

public class Box <T extends Fruit> {
    private final ArrayList<T> box = new ArrayList<>();

    public Box() {

    }

    public float getWeight() {
        float weight = 0.0f;
        for (T o : this.box) weight += o.getWeight();
        return weight;
    }
    public boolean compare(Box<?> anotherBox) {
        return Math.abs(getWeight() - anotherBox.getWeight()) < 0.01; //
    }

    public void pourTo(Box<T> anotherBox) {
        anotherBox.box.addAll(this.box);
        this.box.clear();
    }

    public void addFruit(T fruit, int sum) {
        for (int i = 0; i < sum; i++) {
            this.box.add(fruit);
        }
    }
}
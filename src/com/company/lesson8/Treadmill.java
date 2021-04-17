package com.company.lesson8;



public class Treadmill implements Obstacle {

    public int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public String check(Actor actor) {
        actor.run();
        actor.setSuccess(actor.getMaxLength()>=length);
        if (actor.getSuccess()){

          return "Участник " + actor.getName() + " пробежал: " + length + " км.";
        }else {

            return "Участник " + actor.getName() + " не пробежал: " + length + " км.";

        }
    }
}

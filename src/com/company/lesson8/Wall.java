package com.company.lesson8;

public class Wall implements Obstacle {
private final int height;

    public Wall(int height) {
        this.height = height;
    }




    @Override
    public String check(Actor actor) {
        actor.jump();
        actor.setSuccess(actor.getMaxHeight()>=height);
        if (actor.getSuccess()){

            return  "Участник " + actor.getName() + " перепрыгнул стену высотой " + height + " м ";
        }else return "Участник " + actor.getName() + " не перепрыгнул стену высотой " + height + " м ";
    }
}

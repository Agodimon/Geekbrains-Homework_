package com.company.lesson8;

public class Robot implements Actor {

    private final int maxHeight;
    private final int maxLength;
    private final String name;
    private boolean success=true;


    public Robot(String name, int maxHeight,  int maxLength) {
        this.maxHeight = maxHeight;
        this.name = name;
        this.maxLength=maxLength;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public boolean getSuccess() {
        return success;
    }

    @Override
    public void setSuccess(boolean success) {
        this.success=success;
    }

    @Override
    public void jump() {

    }

    @Override
    public String run() {
        return name+" может перепрыгнуть " + maxHeight+ " м. ";
    }


}



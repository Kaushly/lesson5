package com.company;

import java.io.IOException;

public class Cat {
    public  String nameCat;
    public  boolean hunger;
    public  boolean hungerAll;
    public  int fedUp;


    public Cat(String nameCat) {
        this.nameCat = nameCat;
        this.hunger = true;
        this.hungerAll = true;
        this.fedUp = 5 + (int)(Math.random() * 10);
    }

    public void eat(Bowl bowl) throws IOException {
        hunger = bowl.feed(fedUp);
    }
    public void allEat(Bowl bowl) {
        hungerAll = bowl.feedAll(fedUp);
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public boolean isHunger() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public int getFedUp() {
        return fedUp;
    }

    public void setFedUp(int fedUp) {
        this.fedUp = fedUp;
    }

    @Override
    public String toString() {
        return "Имя кота: " + nameCat +
                ", Кот готодный: " + hunger +
                ", Апптетит = " + fedUp +
                ", ";
    }

}

package com.company;

import java.io.IOException;

public class Main {

//    private static Feeding feeding  = new Feeding();

    public static void main(String[] args) throws IOException {

        Bowl[] bowls = new Bowl[5];
        bowls[0] = new Bowl("первого");
        bowls[1] = new Bowl("второго");
        bowls[2] = new Bowl("третьего");
        bowls[3] = new Bowl("четвертого");
        bowls[4] = new Bowl("пятого");
        Bowl commingBowl = new Bowl("Общая", 20);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Первый");
        cats[1] = new Cat("Второй");
        cats[2] = new Cat("Третий");
        cats[3] = new Cat("Четвертый");
        cats[4] = new Cat("Пятый");

        for (Bowl bowl : bowls) {
            while (bowl.checkAdd()){
                bowl.addSize();
            }
        }


        System.out.println();
        for(int i = 0; i < bowls.length; i++) {
            System.out.println(cats[i]);
            System.out.println(bowls[i]);
            cats[i].eat(bowls[i]);
            System.out.println();
        }
        for(Bowl bowl : bowls){
            System.out.print("Колличество остатков еды в миске:");
            System.out.println(bowl.sizeEat);
        }

        System.out.println();

        for (Cat cat : cats){
            System.out.println(cat);
        }

        System.out.println();
        System.out.println("*******************************");
        System.out.println("*Когда все едят из одной миски*");
        System.out.println("*******************************");
        System.out.println();
        System.out.println();

        for (Cat cat : cats){
            cat.allEat(commingBowl);
            System.out.println("Имя кота; " + cat.getNameCat() +
                    ", когда он ел и общей миски, он голодный: " + cat.hungerAll +
                    ". Осталось еды: " + commingBowl.sizeCommEat);
        }
    }

    private static void printLostEat(Bowl[] bowls) {
        for (Bowl bowl : bowls) {
            System.out.println(bowl.sizeEat);
        }
    }
}

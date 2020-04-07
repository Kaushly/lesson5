package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bowl {
    public String nameBowl;
    public String nameCommBowl;
    public int sizeCommEat;
    public int sizeEat;
    public int size;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Bowl(String nameBowl) {
        this.nameBowl = nameBowl;
        this.sizeEat = 2 + (int) (Math.random() * 10);
        this.size = sizeEat + (int) (Math.random() * 10);
    }

    public Bowl(String nameCommBowl, int sizeCommEat) {
        this.nameCommBowl = nameCommBowl;
        this.sizeCommEat = sizeCommEat;
    }

    boolean feedAll(int fedUp) {
        int result = sizeCommEat - fedUp;
        if (result >= 0) {
            sizeCommEat = sizeCommEat - fedUp;
            return false;
        } else
            return true;
    }

    boolean feed(int fedUp) throws IOException {
        int result = sizeEat - fedUp;
        if (result < 0) {
            if (size >= fedUp) {
                eatMenu();
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int numberMenu = Integer.parseInt(reader.readLine());
                switch (numberMenu) {
                    case 1:
                        System.out.println("сколько еды добавить?");
                        int addEat = Integer.parseInt(reader.readLine());
                        if ((addEat + sizeEat) > size) {
                            System.out.println("Добавили максимум корма!");
                            sizeEat = size;
                            result = sizeEat - fedUp;
                            if (result >= 0) {
                                setSizeEat(result);
                                return false;
                            } else
                                return true;
                        } else {
                            sizeEat = sizeEat + addEat;
                            result = sizeEat - fedUp;
                            if (result >= 0) {
                                setSizeEat(result);
                                return false;
                            } else
                                return true;
                        }
                    case 2:
                        return true;
                }
                return true;
            }
            return true;
        }
        result = sizeEat - fedUp;
        setSizeEat(result);
        return false;
    }

    public boolean checkAdd() throws IOException {
        System.out.println(this);
        bowlMenu();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberMenu = Integer.parseInt(reader.readLine());
        switch (numberMenu) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                return false;
        }
    }

    public void addSize() {
        setSize(size + (int) (Math.random() * 10));
    }

    private void eatMenu() {
        System.out.println("1 - Добавить еды в миску?");
        System.out.println("2 - Оставить все как есть.");
    }

    private void bowlMenu() {
        System.out.println("1 - Увеличить объем миски!");
        System.out.println("2 - Оставить все как есть.");
    }

    private void variesMenu() {
        System.out.println("1 - Все из одной миски едят.");
        System.out.println("2 - Каждый из своей миски ест.");
    }

    public String getNameBowl() {
        return nameBowl;
    }

    public void setNameBowl(String nameBowl) {
        this.nameBowl = nameBowl;
    }

    public int getSizeEat() {
        return sizeEat;
    }

    public void setSizeEat(int sizeEat) {
        this.sizeEat = sizeEat;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Мискa для: " + nameBowl +
                ", еды в ней: " + sizeEat +
                ", вместимость миски: " + size;
    }
}

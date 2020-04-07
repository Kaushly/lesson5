package com.company.test;

public class Person {
    private int age = 0;
    public static int STATIC_AGE = 0;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age + STATIC_AGE;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

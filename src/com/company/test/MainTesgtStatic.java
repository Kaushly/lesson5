package com.company.test;

public class MainTesgtStatic {
    public static void main(String[] args) {
        Person first = new Person();
        Person second = new Person();
        Person third = new Person();

        Person.STATIC_AGE = 10;

        first.setAge(10);
        second.setAge(20);
        third.setAge(30);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

//        System.out.println(Person.STATIC_AGE);


    }
}

package com.boshko.lesson3;

public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.getSun();
        sun.setSize(123);
        sun.setColor("red");

        Sun sun1 = Sun.getSun();
        sun.setSize(555);
        sun.setColor("Yellow");

        System.out.println(sun);
        System.out.println(sun1);
    }


}

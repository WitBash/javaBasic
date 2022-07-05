package com.boshko.lesson6.hw6.task5;

import java.util.Scanner;

public class Person {
    private int age;
    protected Scanner scanner2 = new Scanner(System.in);

    public Person() {
    }

    public void getInfo() {
        System.out.println("Введите ваш возраст");
        this.age = scanner2.nextInt();
        System.out.println(age);
    }
}

package com.boshko.lesson6.hw6.task5;

import java.util.Scanner;

public class Person {
    private int age;
    private String name;
    private Scanner scanner2 = new Scanner(System.in);

    public Person() {
        System.out.println("Введите ваш возраст");
        this.age = scanner2.nextInt();
        scanner2.nextLine();
        System.out.println("Введите ваше имя");
        this.name = scanner2.next();
        scanner2.close();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

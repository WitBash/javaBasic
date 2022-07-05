package com.boshko.lesson6.hw6.task5;

public class User extends Person{
    private String name;

    public User() {

    }

    @Override
    public void getInfo() {
        System.out.println("Введите ваше имя");
        this.name = super.scanner2.nextLine();
        System.out.println(name);
    }
}

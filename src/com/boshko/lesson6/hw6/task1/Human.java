package com.boshko.lesson6.hw6.task1;

public abstract class Human {
    String firstName;
    String secondName;

    public Human(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    String getFirstName() {
        return firstName;
    }

    String getSecondName() {
        return secondName;
    }

    public abstract String getInfo();
}

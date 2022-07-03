package com.boshko.lesson6.hw6.task2;

public abstract class AbstractHuman {
    String firstName;
    String secondName;

    public AbstractHuman(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    String getFirstName() {
        return firstName;
    }

    String getSecondName() {
        return secondName;
    }
}

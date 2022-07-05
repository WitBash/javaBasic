package com.boshko.lesson6.hw6.task2;

public class ClientImpl extends AbstractHuman {

    public ClientImpl(String firstName, String secondName) {
        super(firstName, secondName);
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getSecondName() + " client " + BANKTITLE + " банка.";
    }
}

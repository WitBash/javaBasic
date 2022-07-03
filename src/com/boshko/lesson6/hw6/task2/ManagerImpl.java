package com.boshko.lesson6.hw6.task2;

public class ManagerImpl extends AbstractHuman implements UBSBank {

    public ManagerImpl(String firstName, String secondName) {
        super(firstName, secondName);
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getSecondName() + " manager " + BANKTITLE + " банка.";
    }
}

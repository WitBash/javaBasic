package com.boshko.lesson6.hw6.task1;

public class Client extends Human {

    private String bankTitle;

    public Client(String firstName, String secondName, String bankTitle) {
        super(firstName, secondName);
        this.bankTitle = bankTitle;
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getSecondName() + " client " + bankTitle + " банка.";
    }
}

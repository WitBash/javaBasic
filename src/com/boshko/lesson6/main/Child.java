package com.boshko.lesson6.main;

public class Child extends Parent{

    public Child(String field) {
        super(field);
    }

    @Override
    public void print() {
        System.out.println("This method class Child");
    }
}

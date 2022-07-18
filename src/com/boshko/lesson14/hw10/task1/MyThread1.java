package com.boshko.lesson14.hw10.task1;

public class MyThread1 extends Thread{

    private int b;

    public MyThread1(String name, int b) {
        super(name);
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = 0; i <= b; i++) {
            System.out.println(this.getName() + ": " + i);
        }
    }
}

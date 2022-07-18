package com.boshko.lesson14.hw10.task3;

public class MyThread3 extends Thread{

    private int b;
    private Counter counter;


    public MyThread3(String name, int b,Counter counter) {
        super(name);
        this.b = b;
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < b; i++) {
            counter.increment();
        }
    }
}

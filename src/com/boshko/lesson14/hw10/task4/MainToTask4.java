package com.boshko.lesson14.hw10.task4;

public class MainToTask4 {

    public static void main(String[] args) {
        MyThread4 myThread4 = new MyThread4();

        Thread thread1 = new Thread(myThread4,"Thread-1");
        Thread thread2 = new Thread(myThread4,"Thread-2");

        thread1.start();
        thread2.start();
    }
}

package com.boshko.lesson14.hw10.task2;

public class MainToTask2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2("MyThread2",1000);

        System.out.println(myThread2.getState());
        System.out.println("============================================");

        myThread2.start();

        System.out.println(myThread2.getState());
        System.out.println("============================================");

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(myThread2.getState());
        System.out.println("============================================");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

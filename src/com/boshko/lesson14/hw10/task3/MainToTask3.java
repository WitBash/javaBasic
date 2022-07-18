package com.boshko.lesson14.hw10.task3;

public class MainToTask3 {

    //Метод получает на вход количество запускаемых потоков и количество вызовов метода increment() класса Counter
    public static void printInt(int a, int b, Counter counter) {
        for (int i = 0; i < a; i++) {
            new MyThread3("Thread - " + (i + 1), b, counter).start();
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        printInt(100, 1000, counter);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
    }


}

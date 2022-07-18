package com.boshko.lesson14.hw10.task1;

public class MainToTask1 {

    //Метод получает на вход количество потоков и количество выводимых чисел
    public static void printInt(int a, int b) {
        for (int i = 0; i < a; i++) {
            new MyThread1("Thread - " + (i+1), b).start();
        }
    }

    public static void main(String[] args) {
        printInt(10,100);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

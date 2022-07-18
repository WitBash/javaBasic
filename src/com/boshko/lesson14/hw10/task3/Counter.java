package com.boshko.lesson14.hw10.task3;

public class Counter {
    int count = 0;

    //для решения задачи синхронизируем метод
    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}

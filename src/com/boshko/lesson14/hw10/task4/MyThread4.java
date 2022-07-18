package com.boshko.lesson14.hw10.task4;

public class MyThread4 implements Runnable {

    private boolean isPrinted = false;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (!isPrinted) {
                    System.out.println(Thread.currentThread().getName());
                    isPrinted = true;
                    notify();
                } else {
                    synchronized (this) {
                        isPrinted = false;
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

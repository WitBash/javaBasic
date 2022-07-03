package com.boshko.lesson6.hw6.task4;

import java.util.Scanner;

public class A {

    private int a;
    public Scanner scanner = new Scanner(System.in);

    public A() {
        System.out.println("Введите целое число");
        this.a = scanner.nextInt();
/*
        scanner.close();
        выбрасывается NoSuchElementException при создании и использовании в другом пакете (task5)
        нового Scanner
*/
    }

    public int getA() {
        return a;
    }
}

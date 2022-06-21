package com.boshko.lesson2.hw2;

public class Calculator {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("На ноль делить нельзя");
            return 0.0;
        }
        else {
            return a / b;
        }
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }
    public static double subtraction(double a, double b) {
        return a - b;
    }

    //----------------------------------------------------

    public static double sum(long a, long b) {
        return a + b;
    }
    public static double division(long a, long b) {
        if (b == 0) {
            System.out.println("На ноль делить нельзя");
            return 0.0;
        }
        else {
            return a / b;
        }
    }
    public static double multiplication(long a, long b) {
        return a * b;
    }
    public static double subtraction(long a, long b) {
        return a - b;
    }

    //----------------------------------------------
    public static double sum(int a, int b) {
        return a + b;
    }
    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("На ноль делить нельзя");
            return 0.0;
        }
        else {
            return a / b;
        }
    }
    public static double multiplication(int a, int b) {
        return a * b;
    }
    public static double subtraction(int a, int b) {
        return a - b;
    }

}

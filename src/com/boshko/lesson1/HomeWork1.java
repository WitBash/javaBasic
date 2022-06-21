package com.boshko.lesson1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        // 1 .....
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        // 2 .........

        double d = (46 + 10) * ((double) 10 / 3);
        System.out.println(d);

        int i = (29) * (4) * (-15);
        System.out.println(i);

        // 3 ..........

        int number = 10500;
        double result = ((double) number / 10) / 10;
        System.out.println(result);

        //4 ...........

        float f1 = 3.6f;
        float f2 = 4.1f;
        float f3 = 5.9f;

        float result1 = f1 * f2 * f3;
        System.out.println(result1);

        //5 ............

        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        System.out.println(a1);
        int a2 = scanner.nextInt();
        System.out.println(a2);
        int a3 = scanner.nextInt();
        System.out.println(a3);

        //6 ............

        int b = scanner.nextInt();

        if (b % 2 != 0 & b < 100) {
            System.out.println("Нечетное");
        } else if (b <= 100) {
            System.out.println("Четное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }
    }
}

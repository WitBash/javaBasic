package com.boshko.lesson4.hw4;

import java.util.*;

public class PartOne {

    // 1. печатает нечетные числа от 1 до 99
    public static void oddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // 2. выводит в консоль числа которые делятся на 3, на 5, на 3 и на 5

    public static void task2() {
        System.out.print("Делится на 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i + " ");
            }
        }
        System.out.println();

        System.out.print("Делится на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(" " + i + " ");
            }
        }
        System.out.println();

        System.out.print("Делится на 3 и на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" " + i + " ");
            }
        }
    }

    // 3. проверяет равна ли сумма двух первых введенных чисел третьему введенному числу
    public static boolean task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();

        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        System.out.println("Введите третье число");
        int c = scanner.nextInt();
        scanner.close();

        return a + b == c;
    }

    //4. -------------------------------------------------------------------------------

    public static boolean task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();

        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        System.out.println("Введите третье число");
        int c = scanner.nextInt();

        scanner.close();
        return (b > a && c > b);
    }

    //5. проверяет является ли число 3 первым или последним элементом массива

    private static int[] getArray() {
        Random random = new Random();
        int capacity = random.nextInt(2, 10);
        int[] result = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            result[i] = random.nextInt(20);
        }
        return result;
    }

    public static boolean task5(int[] array) {
        return (array[0] == 3 || array[array.length - 1] == 3);
    }

    //6. проверяет содержит ли массив числа 1 или 3

    public static boolean task6(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) return true;
            else continue;
        }
        return false;
    }

    public static void main(String[] args) {

        // 1. -------------------------------------------------------

        oddNumbers();

        // 2. -------------------------------------------------------

        task2();

        // 3. -------------------------------------------------------

        System.out.println(task3());

        // 4. -------------------------------------------------------

        System.out.println(task4());

        // 5. -------------------------------------------------------

        int[] arrayForTask5 = getArray();
        System.out.println(Arrays.toString(arrayForTask5));
        System.out.println(task5(arrayForTask5));

        // 6. -------------------------------------------------------

        int[] arrayForTask6 = getArray();
        System.out.println(Arrays.toString(arrayForTask6));
        System.out.println(task6(arrayForTask6));
    }
}

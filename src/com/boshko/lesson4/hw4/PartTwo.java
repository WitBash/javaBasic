package com.boshko.lesson4.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class PartTwo {

    //1. проверяет отсортирован ли массив по возрастанию

    public static void task1(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                continue;
            } else {
                System.out.println("Please try again");
                return;
            }
        }
        System.out.println("OK");
    }

    //2. Выводит массив из заданных элементов

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте длину массива. Введите целое число");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите следующий элемент массива");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Array length: " + array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.print("Result: " + Arrays.toString(array));
    }

    //3. Меняет местами первый и последний элементы массива

    public static void task3(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }


    //4. находит первое уникальное число в массиве, если уникальный элемент отсутствует возвращает null

    public static Integer task4(int[] array) {
        int result;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[j] == array[i]) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                result = array[i];
                return result;
            } else continue;
        }
        return null;
    }

    public static void main(String[] args) {

        //1. ---------------------------------------------------

        int[] array = {45, 50, 67, 78, 83, 91, 95, 101};
        task1(array);
        int[] array2 = {45, 50, 67, 78, 71, 91, 95, 101};
        task1(array2);

        //2. ---------------------------------------------------

        task2();

        //3. ---------------------------------------------------

        int[] array3 = {45, 50, 67, 78, 83, 91, 95, 101};
        System.out.println(Arrays.toString(array3));
        task3(array3);
        System.out.println(Arrays.toString(array3));

        //4. ---------------------------------------------------

        int[] array41 = {1, 2, 1, 5, 2, 4};
        System.out.println(task4(array41));

        int[] array42 = {1, 2, 1, 1, 2, 4};
        System.out.println(task4(array42));

        int[] array43 = {4, 2, 1, 2, 2, 4, 4, 1};
        System.out.println(task4(array43));

    }
}

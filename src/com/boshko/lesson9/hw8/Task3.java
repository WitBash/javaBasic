package com.boshko.lesson9.hw8;

import java.util.*;

public class Task3 {
    private static List<Integer> integerArrayList = new ArrayList<>();
    private static List<Integer> integerLinkedList = new LinkedList<>();

    public static void addElements(List<Integer> list) {

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }

    public static void getElements(List<Integer> list) {

        int a;
        for (int i = 0; i < 100000; i++) {
            a = list.get(i + new Random().nextInt(900000));
        }
    }

    public static void main(String[] args) {
        long a1 = System.currentTimeMillis();
        addElements(integerArrayList);
        long a2 = System.currentTimeMillis();
        System.out.println("Время добавления элементов в ArrayList - " + (a2 - a1));

        a1 = System.currentTimeMillis();
        addElements(integerLinkedList);
        a2 = System.currentTimeMillis();
        System.out.println("Время добавления элементов в LinkedList - " + (a2 - a1));

        a1 = System.currentTimeMillis();
        getElements(integerArrayList);
        a2 = System.currentTimeMillis();
        System.out.println("Время получения элементов из ArrayList - " + (a2 - a1));

        a1 = System.currentTimeMillis();
        getElements(integerLinkedList);
        a2 = System.currentTimeMillis();
        System.out.println("Время получения элементов из LinkedList - " + (a2 - a1));
    }
}

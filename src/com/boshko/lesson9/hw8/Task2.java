package com.boshko.lesson9.hw8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    //Метод возвращает коллекцию уникальных объектов
    public static Set<Object> cleanCollection(List<Object> objectList) {
        return new HashSet<>(objectList);
    }

    public static void main(String[] args) {

        Object object1_1 = new Object();
        Object object2 = new Object();
        Object object1_2 = object1_1;
        Object object3_1 = new Object();
        Object object4 = new Object();
        Object object3_2 = object3_1;

        List<Object> objectList = new ArrayList<>();
        objectList.add(object1_1);
        objectList.add(object1_2);
        objectList.add(object2);
        objectList.add(object3_1);
        objectList.add(object3_2);
        objectList.add(object4);

        //Выводим размер коллекции после очистки от дубликатов
        System.out.println(cleanCollection(objectList).size());
    }
}

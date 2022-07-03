package com.boshko.lesson6.main;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Field[] declaredFields = car.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Object object = new Object();
        Parent parent = new Parent("");
        Parent parent2 = new Child("");
        Parent parent3 = new AnotherChild("");

        parent.print();
        parent2.print();
        parent3.print();

        Moveable bus = new Bus();
        Moveable volvo = new Car();

    }

    public static  void printTransportInfo(Moveable transport){
         transport.printTransportInfo();
    }
    public static  void printTransportInfo(Transport transport){
        transport.printTransportInfo();
    }
}

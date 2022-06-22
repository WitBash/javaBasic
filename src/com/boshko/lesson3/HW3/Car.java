package com.boshko.lesson3.HW3;

import com.boshko.lesson2.Color;

public class Car {
    private Color color;
    private String titleModel;
    private int weight;

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", titleModel='" + titleModel + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car(Color.RED);
        Car car2 = new Car(Color.BLACK, 1580);
        Car car3 = new Car();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}

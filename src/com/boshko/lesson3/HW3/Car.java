package com.boshko.lesson3.HW3;

import com.boshko.lesson2.Color;

public class Car {
    private Color color;
    private String titleModel;
    private int weight;

    public Car (Color color){
        this.color = color;
    }

    public Car(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car (){

    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", titleModel='" + titleModel + '\'' +
                ", weight=" + weight +
                '}';
    }
}

package com.boshko.lesson6.hw6.task3;

public class Automobile {
    public int weight;
    public String model;
    public char color;
    public float speed;

    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и ее скорость - " + speed);
    }

    public Automobile(int weight, String model, char color, float speed) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public Automobile() {
    }
}

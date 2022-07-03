package com.boshko.lesson6.hw6.task3;

public class Truck extends Automobile {

    private int numberOfWheels;
    private int maxWeight;

    public Truck(int weight, String model, char color, float speed, int numberOfWheels, int maxWeight) {
        super(weight, model, color, speed);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        System.out.println("Количество колес - " + numberOfWheels);
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колес - " + numberOfWheels + ", максимальный вес с учетом полной загрузки - " + maxWeight + ".");
    }
}

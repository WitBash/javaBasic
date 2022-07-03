package com.boshko.lesson6.main;

public class Plane extends Transport{
    public Plane(Integer weight, Integer seatPlace, boolean isFlying) {
        super(weight, seatPlace, isFlying);
    }

    @Override
    void abstractMethod() {
        System.out.println("abstract Method");
    }



    @Override
    public String transportName() {
        return null;
    }
}

package com.boshko.lesson6.main;

public abstract class Transport implements Moveable{
    private Integer weight;
    private Integer seatPlace;
    private boolean isFlying;

    public Transport(Integer weight, Integer seatPlace, boolean isFlying) {
        this.weight = weight;
        this.seatPlace = seatPlace;
        this.isFlying = isFlying;
    }

    abstract void abstractMethod();

    public void info(){
        //logic
    }

    @Override
    public void printTransportInfo() {

    }
}

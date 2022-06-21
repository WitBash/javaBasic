package com.boshko.lesson2.hw2;

public class Flat {

    private double square;
    private String address;
    private int floor;
    private long price;


    public Flat(double square, String address, int floor, long price) {
        this.square = square;
        this.address = address;
        this.floor = floor;
        this.price = price;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "square=" + square +
                ", address='" + address + '\'' +
                ", floor=" + floor +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Flat flat = new Flat(80.5,"Санкт-Петербург",8, 16000000);
        System.out.println(flat);
    }
}

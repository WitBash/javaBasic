package com.boshko.lesson3.HW3;

public class House {
    private int numberOfFloors;
    private int yearOfConstruction;
    private String title;

    public House(int numberOfFloors, int yearOfConstruction, String title) {
        this.numberOfFloors = numberOfFloors;
        this.yearOfConstruction = yearOfConstruction;
        this.title = title;
    }

    public int ageBuilding(int year){
        return year - yearOfConstruction;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfFloors=" + numberOfFloors +
                ", yearOfConstruction=" + yearOfConstruction +
                ", title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {
        House house1 = new House(3,2018,"Romantic");
        House house2 = new House(8,2019,"New Wave");

        System.out.println(house1);
        System.out.println(house2);
    }

}

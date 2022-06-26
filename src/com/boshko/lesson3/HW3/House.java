package com.boshko.lesson3.HW3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class House {
    private int numberOfFloors;
    private int yearOfConstruction;
    private String title;

    public void setHouse(int numberOfFloors, int yearOfConstruction, String title) {
        this.numberOfFloors = numberOfFloors;
        this.yearOfConstruction = yearOfConstruction;
        this.title = title;
    }

    public int ageBuilding() {
        Calendar calendar = new GregorianCalendar();
        return calendar.get(Calendar.YEAR) - yearOfConstruction;
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
        House house1 = new House();
        House house2 = new House();

        house1.setHouse(3, 2018, "Romantic");
        house2.setHouse(8, 2019, "New Wave");

        System.out.println(house1);
        System.out.println(house2);

        System.out.println(house1.ageBuilding());
        System.out.println(house2.ageBuilding());
    }

}

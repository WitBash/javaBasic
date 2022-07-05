package com.boshko.lesson7.hw7;

public class Airplane {

    private Wing wing;

    public Airplane(double weight) {
        this.wing = new Wing();
        wing.setWeight(weight);
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    class Wing {
        private double weight;

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Wing{" +
                    "weight=" + weight +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "wing=" + wing +
                '}';
    }

    public static void main(String[] args) {
        Airplane airplane1 = new Airplane(556.50);
        Airplane airplane2 = new Airplane(685.50);

        System.out.println(airplane1);
        System.out.println(airplane2);
    }
}

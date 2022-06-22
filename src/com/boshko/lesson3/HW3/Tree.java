package com.boshko.lesson3.HW3;

public class Tree {
    private int age;
    private boolean isAlive;
    private String title;

    public Tree(int age, String title) {
        this.age = age;
        this.title = title;
    }

    public Tree(int age, boolean isAlive, String title) {
        this.age = age;
        this.isAlive = isAlive;
        this.title = title;
    }

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Tree tree1 = new Tree(12,"Клен");
        Tree tree2 = new Tree(8, true, "Береза");
        Tree tree3 = new Tree();

        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}

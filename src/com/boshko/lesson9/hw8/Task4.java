package com.boshko.lesson9.hw8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {

    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Map<User, Integer> map = new HashMap<>();

        map.put(new User("Bob"), 150);
        map.put(new User("Mike"), 185);
        map.put(new User("Derek"), 124);
        map.put(new User("Bill"), 121);
        map.put(new User("Gans"), 186);

        System.out.println(checkPoints(map));

    }

    public static Integer checkPoints(Map<User, Integer> map) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя...");
        String s = scanner.nextLine();

        for (Map.Entry<User, Integer> userIntegerEntry : map.entrySet()) {
            if (userIntegerEntry.getKey().getName().equalsIgnoreCase(s)) {
                return userIntegerEntry.getValue();
            }
        }
        System.out.println("Игрок с таким именем не зарегистрирован");
        return a;
    }

}

package com.boshko.lesson10.hw9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    //1. Метод считывает файл и возвращает список строк

    public static List<String> readFile(File file) {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s = "";
            while ((s = br.readLine()) != null) {
                stringList.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    //2. Метод записывает переданную строку в файл

    public static void writeToFile(File file, String str) {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(str + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //3. Метод производит слияние двух файлов в один

    public static void mergeTwoFiles(File file1, File file2, File file3) throws FileNotFoundException {
        List<String> list1 = readFile(file1);
        List<String> list2 = readFile(file2);
        list1.addAll(list2);

        for (String o : list1) {
            writeToFile(file3, o);
        }
    }

    //4. Метод заменяет все символы кроме букв и цифр в файле на знак $

    public static void replacingCharacters(File file) {
        FileWriter fw = null;
        FileReader fr = null;

        try {
            fr = new FileReader(file);
            StringBuilder s = new StringBuilder();
            String str = "";
            int i = 0;

            while ((i = fr.read()) != -1) {
                str = Character.toString(i);
                if (str.matches("[а-яА-Яa-zA-Z0-9\n]")) {
                    s.append(str);
                } else {
                    s.append("$");
                }
            }

            fw = new FileWriter(file);
            fw.write(s.toString());
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {

        //1.========================================================

        System.out.println(readFile(new File("files/task1.txt")));

        //2.========================================================

        writeToFile(new File("files/task2.txt"), "Это строка для task2");

        //3.========================================================

        try {
            mergeTwoFiles(new File("files/task1.txt"), new File("files/task2.txt"), new File("files/task3.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //4.========================================================

        replacingCharacters(new File("files/task4.txt"));

    }

}

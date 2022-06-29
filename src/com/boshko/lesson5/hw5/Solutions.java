package com.boshko.lesson5.hw5;

import java.util.Locale;

public class Solutions {
    //1. метод для поиска самого длинного слова
    public static String task1(String text) {
        String[] arrayStrings = text.split(" ");
        String s = arrayStrings[0];
        for (int i = 1; i < arrayStrings.length; i++) {
            if (arrayStrings[i].length() > s.length()) {
                s = arrayStrings[i];
            }
        }
        return s;
    }

    //2. Метод проверяет является ли слово палиндромом

    public static boolean task2(String word) {
        String s = word;
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        return s.equalsIgnoreCase(builder.toString());
    }

    /* 3. Метод заменяет в тексте все вхождения слова "бяка" на "[censored]",
     *    включая случай когда "бяка" повторяется в одном слове больше !!!одного раза
     */

    public static String task3(String text, String str) {
        String[] arrayStrings = text.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        String cens = "[censored]";

        for (String arrayString : arrayStrings) {
            if (arrayString.equalsIgnoreCase(str)) {
                stringBuilder.append(cens)
                        .append(" ");
            } else if (arrayString.toLowerCase().contains(str)) {
                String s = arrayString;
                StringBuilder sbTemp = new StringBuilder();

                while (s.toLowerCase().contains(str)) {
                    int beginIndex = s.toLowerCase(Locale.ROOT).indexOf(str);
                    s = s.substring(0, beginIndex) + s.substring(beginIndex + 4);

                    if (!s.toLowerCase(Locale.ROOT).contains(str)) {
                        sbTemp.append(s).insert(beginIndex, cens);
                    } else {
                        s = sbTemp.append(s).insert(beginIndex, cens).toString();
                        sbTemp.delete(0, sbTemp.length());
                    }
                }
                stringBuilder.append(sbTemp)
                        .append(" ");
            } else {
                stringBuilder.append(arrayString)
                        .append(" ");
            }
        }
        return stringBuilder.toString();
    }

    /* 4. Метод находит количество вхождений одной строки в другую
     *  включая несколько вхождений в одном слове
     */

    public static int task4(String string, String str) {
        int counter = 0;
        String[] arrayStrings = string.split(" ");
        for (int i = 0; i < arrayStrings.length; i++) {
            while (arrayStrings[i].contains(str)) {
                arrayStrings[i] = arrayStrings[i].replaceFirst(str, "");
                counter++;
            }
        }
        return counter;
    }


    //5. Метод инвертирует слова в строке
    public static String task5(String text) {
        String[] arrayStrings = text.split(" ");
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < arrayStrings.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            resultBuilder.append(stringBuilder.append(arrayStrings[i]).reverse())
                    .append(" ");
        }
        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        //1. --------------------------------------------------
        System.out.println(task1("Постоянные сомнения, касающиеся оптимальных путей создания текстов для главной, стали вполне привычными спутниками авторов"));

        //2. --------------------------------------------------
        System.out.println(task2("Balab"));

        //3. --------------------------------------------------
        System.out.println(task3("Постоянные бякасомнения, касающиеся БЯКА оптимальных путей создбЯкаания текстов для главной, БякАсбякатбяКАаБЯкалБЯКАибяКа вполне привычными спутникамибяка авторов", "бяка"));

        //4. --------------------------------------------------
        System.out.println(task4("Отмечалось, что супруга футболиста выступила против его дальнейших выступлений в России", "у"));

        //5. --------------------------------------------------
        System.out.println(task5("This is a test string"));

    }
}

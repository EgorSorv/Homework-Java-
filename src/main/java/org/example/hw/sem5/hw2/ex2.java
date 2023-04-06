package org.example.hw.sem5.hw2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String str = "Курьер Карпов сообщил, что будто бы этот самый маг остановился на квартире у Лиходеева. " +
                "На квартире, конечно, тотчас побывали. " +
                "Никакого мага там не оказалось. " +
                "Самого Лиходеева тоже нет. " +
                "Домработницы Груни нету, и куда она девалась, никто не знает. " +
                "Председателя правления Никанора Ивановича нету, Пролежнева нету!";

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите слово, которое нужно найти: ");
        String findWord = sc.nextLine().toLowerCase();

        printMap(createMap(createStrArr(str), findWord), findWord);

        sc.close();
    }

    private static String[] createStrArr(String str) {
        return str
                .replaceAll("[-+.^<>%*&:,!?;/(){}#№_=|]", "")
                .toLowerCase()
                .split(" ");
    }

    private static Map<String, Integer> createMap(String[] splitStr, String findWord) {
        Map<String, Integer> result = new HashMap<>();

        result.put(findWord, 0);

        for (String s : splitStr) {
            if (Objects.equals(s, findWord)) result.put(findWord, result.get(findWord) + 1);
        }

        return result;
    }

    private static void printMap(Map<String, Integer> result, String findWord) {
        System.out.println("Слово '" + findWord + "' встречается => " + result.get(findWord) + " раз");
    }
}

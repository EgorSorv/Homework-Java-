package org.example.hw.sem5.hw1;

import java.util.HashMap;
import java.util.Map;

public class ex1 {
    public static void main(String[] args) {
        String str = "Курьер Карпов сообщил, что будто бы этот самый маг остановился на квартире у Лиходеева. " +
                "На квартире, конечно, тотчас побывали. " +
                "Никакого мага там не оказалось. " +
                "Самого Лиходеева тоже нет. " +
                "Домработницы Груни нету, и куда она девалась, никто не знает. " +
                "Председателя правления Никанора Ивановича нету, Пролежнева нету!";

        printMap(createMap(createStrArr(str)));

    }

    private static String[] createStrArr(String str) {
        return str
                .replaceAll("[-+.^<>%*&:,!?;/(){}#№_=|]", "")
                .toLowerCase()
                .split(" ");
    }

    private static Map<String, Integer> createMap(String[] splitStr) {
        Map<String, Integer> result = new HashMap<>();

        for (String s: splitStr) {
            if (!result.containsKey(s)) result.put(s, 1);
            else result.put(s, result.get(s) + 1);
        }

        return result;
    }

    private static void printMap(Map<String, Integer> result) {
        for (var entry: result.entrySet()) {
            System.out.println("Слово '" + entry.getKey() + "' встречается => " + entry.getValue() + " раз");
        }
    }
}

package org.example.hw.sem6.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Filter {
    private static final Scanner sc = new Scanner(System.in);

    public static void program (Set<Laptop> set) {
        System.out.println("""
                Введите критерий для фильтрации:\s
                1 - Модель\s
                2 - Объем оперативной памяти\s
                3 - Операционная система\s
                4 - Тип диска\s
                5 - Объем диска\s
                6 - Цена\s
                7 - Завершить\s
                """);

        Map<String, String> query = new HashMap<>();

        int key = sc.nextInt();

        while (key != 7) {
            switch (key) {
                case (1) -> query.put("model", modelFilter());
                case (2) -> query.put("ram", ramFilter());
                case (3) -> query.put("os", osFilter());
                case (4) -> query.put("drive", driveTypeFilter());
                case (5) -> query.put("capacity", driveCapacityFilter());
                case (6) -> {
                    query.put("min price", minPriceFilter());
                    query.put("max price", maxPriceFilter());
                }
            }

            System.out.println("""
                Введите критерий для фильтрации:\s
                1 - Модель\s
                2 - Объем оперативной памяти\s
                3 - Операционная система\s
                4 - Тип диска\s
                5 - Объем диска\s
                6 - Цена\s
                7 - Завершить\s
                """);

            key = sc.nextInt();
        }

        sortedSet(set, query);

        sc.close();
    }

    private static void sortedSet(Set<Laptop> set, Map<String, String> query) {

        Set<Laptop> setSorted = new HashSet<>();

            if (query.containsKey("model")) modelSorted(query.get("model"), set, setSorted);
            if (query.containsKey("ram")) ramSorted(query.get("ram"), set, setSorted);
            if (query.containsKey("os")) osSorted(query.get("os"), set, setSorted);
            if (query.containsKey("drive")) driveSorted(query.get("drive"), set, setSorted);
            if (query.containsKey("capacity")) capacitySorted(query.get("capacity"), set, setSorted);
            if (query.containsKey("min price")) priceSorted(query.get("min price"), query.get("max price"), set, setSorted);

            if (setSorted.isEmpty() && query.isEmpty()) printSet(set);
            else if (setSorted.isEmpty()) System.out.println("Не найдено ноутбуков, удовлетворяющих заданным условиям");
            else printSet(setSorted);
    }

    private static void modelSorted(String model, Set<Laptop> set, Set<Laptop> setSorted) {
        for (Laptop item: set) {
            if (item.getModel().contains(model)) setSorted.add(item);
        }
    }

    private static void ramSorted(String ram, Set<Laptop> set, Set<Laptop> setSorted) {
        int number = Integer.parseInt(ram);
        Set<Laptop> temporary = new HashSet<>();

        if (setSorted.isEmpty()) {
            for (Laptop item : set) {
                if (item.getRam() == number) setSorted.add(item);
            }
        } else {
            for (Laptop item : set) {
                if (item.getRam() == number) temporary.add(item);
            }

            setSorted.retainAll(temporary);
        }
    }

    private static void osSorted(String os, Set<Laptop> set, Set<Laptop> setSorted) {
        Set<Laptop> temporary = new HashSet<>();

        if (setSorted.isEmpty()) {
            for (Laptop item : set) {
                if (item.getOs().contains(os)) setSorted.add(item);
            }
        } else {
            for (Laptop item : set) {
                if (item.getOs().contains(os)) temporary.add(item);
            }

            setSorted.retainAll(temporary);
        }
    }

    private static void driveSorted(String drive, Set<Laptop> set, Set<Laptop> setSorted) {
        Set<Laptop> temporary = new HashSet<>();

        if (setSorted.isEmpty()) {
            for (Laptop item : set) {
                if (item.getDriveType().contains(drive)) setSorted.add(item);
            }
        } else {
            for (Laptop item : set) {
                if (item.getDriveType().contains(drive)) temporary.add(item);
            }

            setSorted.retainAll(temporary);
        }
    }

    private static void capacitySorted(String capacity, Set<Laptop> set, Set<Laptop> setSorted) {
        int number = Integer.parseInt(capacity);
        Set<Laptop> temporary = new HashSet<>();

        if (setSorted.isEmpty()) {
            for (Laptop item : set) {
                if (item.getDriveCapacity() == number) setSorted.add(item);
            }
        } else {
            for (Laptop item : set) {
                if (item.getDriveCapacity() == number) temporary.add(item);
            }

            setSorted.retainAll(temporary);
        }
    }

    private static void priceSorted(String min, String max, Set<Laptop> set, Set<Laptop> setSorted) {
        int minPrice = Integer.parseInt(min);
        int maxPrice = Integer.parseInt(max);
        Set<Laptop> temporary = new HashSet<>();

        if (setSorted.isEmpty()) {
            for (Laptop item : set) {
                if (minPrice <= item.getPrice() && item.getPrice() <= maxPrice) setSorted.add(item);
            }
        } else {
            for (Laptop item : set) {
                if (minPrice <= item.getPrice() && item.getPrice() <= maxPrice) temporary.add(item);
            }

            setSorted.retainAll(temporary);
        }
    }

    private static void printSet(Set<Laptop> set) {
        for (Laptop item: set) System.out.println(item + "\n");
    }

    private static String minPriceFilter() {
        System.out.println("Введите минимальную цену:");
        int min = sc.nextInt();

        return  Integer.toString(min);
    }

    private static String maxPriceFilter() {
        System.out.println("Введите максимальную цену:");
        int max = sc.nextInt();

        return Integer.toString(max);
    }

    private static String driveCapacityFilter() {
        System.out.println("Введите необходимый объем диска:");
        int capacity = sc.nextInt();

        return Integer.toString(capacity);
    }

    private static String driveTypeFilter() {
        System.out.println("Введите необходимый тип диска (1 - HDD или 2 - SSD):");
        int drive = sc.nextInt();

        return switch (drive) {
            case (1) -> "HDD";
            case (2) -> "SSD";
            default -> null;
        };
    }

    private static String osFilter() {
        System.out.println("Введите подходящую операционную систему (1 - Windows, 2 - Linux, 3 - MacOS):");

        int os = sc.nextInt();

        return switch (os) {
            case (1) -> "Windows";
            case (2) -> "Linux";
            case (3) -> "MacOS";
            default -> null;
        };
    }

    private static String ramFilter() {
        System.out.println("Введите необходимый объем оперативной памяти:");
        int ram = sc.nextInt();

        return Integer.toString(ram);
    }

    private static String modelFilter() {
        System.out.println("Введите подходящую модель ноутбука (1 - Samsung, 2 - HP, 3 - Acer, 4 - ASUS," +
                "5 - Apple, 6 - HUAWEI, 7 - Lenovo, 8 - MSI):");
        int model = sc.nextInt();

        return switch (model) {
            case (1) -> "Samsung";
            case (2) -> "HP";
            case (3) -> "Acer";
            case (4) -> "ASUS";
            case (5) -> "Apple";
            case (6) -> "HUAWEI";
            case (7) -> "Lenovo";
            case (8) -> "MSI";
            default -> null;
        };
    }


}

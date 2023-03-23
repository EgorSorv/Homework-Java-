package org.example.hw.sem3;

import org.example.hw.sem3.model.Merchandises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Merchandises merchandise1 = new Merchandises("апельсин", "Марокко", 50, 200, 1);
        Merchandises merchandise2 = new Merchandises("мука", "Италия", 200, 100, 3);
        Merchandises merchandise3 = new Merchandises("гречка", "Россия", 500, 170, 1);
        Merchandises merchandise4 = new Merchandises("банан", "Эквадор", 50, 100, 2);
        Merchandises merchandise5 = new Merchandises("помидор", "Китай", 120, 50, 3);
        Merchandises merchandise6 = new Merchandises("огурец", "Турция", 30, 150, 2);
        Merchandises merchandise7 = new Merchandises("ананас", "Бразилия", 80, 170, 1);
        Merchandises merchandise8 = new Merchandises("гранат", "Индия", 50, 75, 3);
        Merchandises merchandise9 = new Merchandises("яблоко", "Россия", 45, 170, 1);
        Merchandises merchandise10 = new Merchandises("вишня", "Турция", 10, 100, 2);

        List<Merchandises> merchandisesList = new ArrayList<>();

        merchandisesList.add(merchandise1);
        merchandisesList.add(merchandise2);
        merchandisesList.add(merchandise3);
        merchandisesList.add(merchandise4);
        merchandisesList.add(merchandise5);
        merchandisesList.add(merchandise6);
        merchandisesList.add(merchandise7);
        merchandisesList.add(merchandise8);
        merchandisesList.add(merchandise9);
        merchandisesList.add(merchandise10);

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите нужный сорт товара: ");
        int searchSort = sc.nextInt();

        int min = merchandisesList.get(0).getCost();

        for (Merchandises merchandises : merchandisesList) {
            if (merchandises.getCost() < min && merchandises.getSort() == searchSort) min = merchandises.getCost();
        }

        List<String> names = new ArrayList<>();

        for (Merchandises merchandises : merchandisesList) {
            if (merchandises.getSort() == searchSort && merchandises.getCost() == min) {
                names.add(merchandises.getName());
            }
        }

        System.out.println("Список товаров с минимальной стоимостью заданного сорта => " + names);

        sc.close();

    }
}

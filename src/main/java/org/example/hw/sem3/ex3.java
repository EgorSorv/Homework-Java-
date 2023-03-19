package org.example.hw.sem3;

import org.example.hw.sem3.model.Books;

import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {
        Books book1 = new Books("Властелин Колец. Возвращение короля", "Толкин", 540, 2017, 448);
        Books book2 = new Books("Мастер и Маргарита", "Булгаков", 250, 2018, 509);
        Books book3 = new Books("1984", "Оруэлл", 1392, 2022, 383);
        Books book4 = new Books("Последнее желание", "Сапковский", 506, 2007, 320);
        Books book5 = new Books("Зов Ктулху", "Лавкрафт", 534, 2020, 480);
        Books book6 = new Books("Мы", "Замятин", 474, 2021, 283);
        Books book7 = new Books("Метро 2033", "Глуховский", 895, 2019, 384);
        Books book8 = new Books("Преступление и наказание", "Достоевский", 240, 2015, 672);
        Books book9 = new Books("Белая гвардия", "Булгаков", 293, 2023, 479);
        Books book10 = new Books("Божественная комедия", "Алигьери", 1752, 2023, 911);

        List<Books> booksList = new ArrayList<>();

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);
        booksList.add(book9);
        booksList.add(book10);

        List<String> names = new ArrayList<>();

        for (Books books : booksList) {
            if (books.getAuthorSurname().toLowerCase().contains("а")
            && books.getYear() >= 2010
            && checkForPrimeNumbers(books.getPages())) names.add(books.getBookName());
        }

        System.out.println("Названия нужных книг => " + names);

    }

    public static boolean checkForPrimeNumbers(int x) {
        boolean result = false;
        boolean check = true;

        if (x == 2 || x == 3) result = true;

        else if (x != 0 && x != 1) {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    check = false;
                    break;
                }
                 if (check) result = true;
            }
        }
        return result;
    }
}

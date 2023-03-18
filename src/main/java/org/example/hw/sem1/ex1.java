package org.example.hw.sem1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");

        String phrase = sc.nextLine();
        String [] newString = phrase.split(" ");

        StringBuilder result = new StringBuilder(newString.length);

        for (int i = newString.length - 1; i >= 0; i--) {
            if (newString[i].length() != 0) {

                if (result.length() != 0) result.append(" ");

                result.append(newString[i]);
            }
        }

        System.out.println(result.toString());
        sc.close();
    }
}

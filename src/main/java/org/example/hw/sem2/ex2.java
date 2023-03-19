package org.example.hw.sem2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину последовательности: ");
        int n = sc.nextInt();

        System.out.println("Введите последовательность чисел: ");

        int number = sc.nextInt();
        boolean check = true;

        while (n - 1 != 0) {
            int nextNumber = sc.nextInt();

            if (nextNumber <= number) check = false;

            number = nextNumber;
            n--;
        }

        if (!check) {
        System.out.println("Последовательность не является возрастающей");
    } else {
        System.out.println("Последовательность является возрастающей");
        }
    }
}

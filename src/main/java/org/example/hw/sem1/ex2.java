package org.example.hw.sem1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательность целых чисел. Когда будет введен 0, последовательность завершится: ");

        int sum = 0;
        int number = sc.nextInt();

        while (number != 0) {
            int nextNumber = sc.nextInt();

            if (number > 0 && nextNumber < 0) {
                sum += number;
            }

            number = nextNumber;
        }

        System.out.printf("Сумма положительных чисел, после которых следует отрицательное число => %d", sum);
        sc.close();
    }
}

package org.example.hw.sem2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину последовательности: ");
        int n = sc.nextInt();

        System.out.println("Введите последовательность чисел: ");

        int sum = 0;
        boolean check = true;

        while (n != 0) {
            int number = sc.nextInt();

            if (number == 2 || number == 3) sum += number;
            else if (number == 0 || number == 1) {
                check = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check && n != 2 && n != 3) sum += number;
            }

            check = true;
            n--;
        }

        System.out.printf("Сумма простых чисел => %d", sum);
        sc.close();
    }
}

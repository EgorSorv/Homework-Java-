package org.example.hw.sem1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число в двоичной системе: ");
        String a = sc.nextLine();

        System.out.println("Введите второе число в двоичной системе: ");
        String b = sc.nextLine();

        System.out.printf("Сумма этих чисел в двоичной системе => " + Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2)));
        sc.close();
    }
}

package org.example.hw.sem2;

import java.util.Scanner;
import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int n = sc.nextInt();

        int[] sequence = new int[n];
        int indexSum = 0;

        System.out.println("Введите значения для массива: ");

        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
            if ((sequence[i] < 100 && sequence[i] > 9) || (sequence[i] > -100 && sequence[i] < -9)) indexSum += i;
        }

        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] < 0) {
                sequence[i] = indexSum;
            }
        }
        String sequenceString = Arrays.toString(sequence);
        System.out.printf("Измененный массив: %n %s", sequenceString);
        sc.close();
    }
}

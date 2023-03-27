package org.example.hw.sem4.hw1;

import java.util.LinkedList;

public class ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        for (int i = 1; i < 10; i++) {
            integerLinkedList.add(i);
        }

        System.out.println("Исходный список => " + integerLinkedList);
        System.out.println("Перевернутый список => " + reverseLinkedList(integerLinkedList));
    }

    private static LinkedList<Integer> reverseLinkedList (LinkedList<Integer> someList) {

        LinkedList<Integer> reversedLinkedList = new LinkedList<>();

        for (int i = someList.size() - 1; i >= 0; i--) {
            reversedLinkedList.add(someList.get(i));
        }

        return reversedLinkedList;
    }
}

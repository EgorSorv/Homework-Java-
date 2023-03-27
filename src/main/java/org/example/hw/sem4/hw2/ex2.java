package org.example.hw.sem4.hw2;

import java.util.Stack;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку, состоящую из скобок: ");
        String s = sc.nextLine();

        if (validParentheses(s)) System.out.println("Скобки в строке введены корректно");
        else System.out.println("Скобки в строке введены некорректно");

        sc.close();
    }

    private static boolean validParentheses(String s) {
        Stack<Character> check = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '{' || c == '(' || c == '[')
                check.push(c);

            else if(!check.isEmpty()){
                if((c == ']' && check.peek() == '[')
                        ||(c == '}' && check.peek() == '{')
                        || (c == ')' && check.peek() == '('))
                    check.pop();
                else
                    check.push(c);
            }
            else check.push(c);
        }

        return check.isEmpty();
    }
}

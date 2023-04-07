/*
Lesson 1. HomeWork. Meeting with Java.
TASKS:
1. Вычислить: n-ое треугольное число(сумма чисел от 1 до n), n! (факториал чисел от 1 до n).
2. Вывести все простые числа от 1 до 1000
3. Реализовать простой калькулятор
4. +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.
*/

// Task 2.

import java.util.Scanner;

class hw1_task2 {
    public static void main(String[] args) {
        int num1 = 2;  
        int num2 = 1000; 
        boolean flag = true;
        while (num1 < num2) {
            for (int i = 2; i <= Math.sqrt(num1)+1; i++) {
                if (num1  == 2) System.out.print("Array of simple numbers till 1000 is: \n" + num1 + " ");
                if (num1 % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(num1 + " ");
            flag = true;
            num1++;
        }
    
    System.out.print("\nSorry for num-SPAM )))");
    }
}


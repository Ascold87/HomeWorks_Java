/*
Lesson 1. HomeWork. Meeting with Java.
TASKS:
1. Вычислить: n-ое треугольное число(сумма чисел от 1 до n), n! (факториал чисел от 1 до n).
2. Вывести все простые числа от 1 до 1000
3. Реализовать простой калькулятор
4. Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.
*/

// Task 1.

import java.util.Scanner;

class hw1_task1 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in); // init Scanner
        int a = sc.nextInt();                // add int
        sc.close();                          // close Scanner

        int sumt = 0;   // add const
        int fact = 1;   // add const

        for (int i = 1; i <= a; i++) {  // run the loop 4 sumT
            sumt += i;
        }
        for (int j = 2; j <= a; j++) {  // run the loop 4 Factor!al
            fact *= j;
        }
        
        System.out.println("'Triangle number' of " + a + " is " + sumt + ".\n" + "Factorial of " + a + " is " + fact + ".");
    }
}

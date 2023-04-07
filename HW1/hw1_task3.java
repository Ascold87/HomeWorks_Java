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

// Task 3.

import java.util.Scanner;

class hw1_task3 {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to calculator-console-app.");

        System.out.println("Enter the first number: ");
        int fnum = sc.nextInt(); 

        System.out.println("Enter the second number: ");
        int snum = sc.nextInt();

        System.out.println("Enter operator: ");
        String sign = sc.next();

        sc.close();

        switch (sign){ 
            case ("+"):
                System.out.println(fnum + " + " + snum + " = " + (fnum + snum));
                break;
            case ("-"):
                System.out.println(fnum + " - " + snum + " = " + (fnum - snum));
                break;
            case ("*"):
                System.out.println(fnum + " * " + snum + " = " + (fnum * snum));
                break;
            case ("/"):
                if (snum == 0) { 
                    System.out.println("На ноль делить нельзя");
                } 
                else System.out.println(fnum + " / " + snum + " = " + (fnum/snum));
                break;
        default:
            System.out.println("Error. 404. Try again.");
            break;
        }

    }  
} 
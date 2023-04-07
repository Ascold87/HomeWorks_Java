/*
Lesson 1. HomeWork. Meeting with Java.
TASKS:
1. Вычислить: n-ое треугольное число(сумма чисел от 1 до n), n! (факториал чисел от 1 до n).
2. Вывести все простые числа от 1 до 1000
3. Реализовать простой калькулятор
4. Задано уравнение вида q + w = e
    q, w, e >= 0. 
    Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.
*/

// Task 4.

package homework_1;

import java.util.Scanner;

public class hw1_task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // создаём сканер
        System.out.print("Enter the equation: "); // просим ввести уравнение
        String input = scan.nextLine(); // записываем в input уравнение
        String str = input.replace(" ", ""); // записываем в str уравнение без пробелов
        int index = str.indexOf("+"); // определяем + или - в уравнении
        String[] digits = str.split("\\+|-|="); // создаём список чисел в строковом значении
        scan.close(); // закрываем сканер
        int aLen = digits[0].length(); // определяем длину числа А
        int aCount = Count(digits[0]); // определяем количество ? в числе А
        int bLen = digits[1].length(); // определяем длину числа В
        int bCount = Count(digits[1]); // определяем количество ? в числе В
        Integer[] nums = new Integer[3]; // создаём список чисел в числовом значении
        nums[2] = Integer.parseInt(digits[2]); // записываем в список последним результат уравнения
        

        /* for (int i = 0; i < 2; i++) {
            if (digits[i].contains("?")) {
                nums[i] = Integer.parseInt(digits[i].replaceAll("?", "0"));
            }
            else {
                nums[i] = Integer.parseInt(digits[i]);
            }
        } */
    }

    public static Integer Count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '?') {
                count++;
            }
        }
        return count;
    }
}

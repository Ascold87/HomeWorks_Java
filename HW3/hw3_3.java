// Урок 3. Коллекции JAVA: Введение
// 3. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class hw3_3 {
    public static void main(String[] args) {
        System.out.println("\nПрограмма генерирует список целых случайных чисел. \nНаходит максимальное и минимальное значения, и вычисляет среднее арифметическое из них.\n");
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }

        System.out.println("Cгенерированный массив: " + list);
        int min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        int aver = 0;
        for (int i = 0; i < list.size(); i++) {
            aver = aver + list.get(i);
        }
        int average = aver / list.size();

        System.out.println("Значения:");
        System.out.println("- максимальное - " + max);
        System.out.println("- минимальное - " + min);
        System.out.println("- среднее арифметическое - " + average);
    }
}

// Задание 2. К калькулятору из предыдущего ДЗ добавить логирование.

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

public class hw2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа Калькулятор с логгированием.");
        System.out.print("Число А: ");
        int a = sc.nextInt();
        System.out.print("Оператор: ");
        char s = sc.next().charAt(0);
        System.out.print("Число Б: ");
        int b = sc.nextInt();
        sc.close();

        int res = Calc(a, s, b);
        System.out.printf("Результат: " + a + s + b + " = " + res + "\n");
        toLog(res);
    }

    public static int Calc(int a, char s, int b) {
        int res=0;
        if (s == '+') {
            res = a + b;
        }
        if (s == '-') {
            res = a - b;
        }
        if (s == '*') {
            res = a * b;
        }
        if (s == '/') {
            res = a / b;
        }
        return res;
    }

    public static void toLog(Integer res) {
        Logger log = Logger.getLogger("Calc");
        FileHandler fh;
        try {
            fh = new FileHandler("hw2_2_log");
            log.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("\n" + "RESULT: " + res);
    }
}

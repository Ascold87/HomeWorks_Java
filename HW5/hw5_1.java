// Java: знакомство и как пользоваться базовым API (семинары)
// Урок 5. Хранение и обработка данных ч2: множество коллекций Map

// 1. Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class hw5_1 {
    public static void main(String[] args) {

        Map<String, List<Integer>> db = new HashMap<>();        // инициализация HashMap с именем db
        db.putIfAbsent("Рудазов", List.of(04510451));   // введ ключ-значений (современные писатели-фантасты)
        db.put("Лисина",  List.of(2345432, 1591212));
        db.put("Князев",  List.of(789123456));
        db.put("Круз",    List.of(911911911));
        db.put("Берг",    List.of(012012012));
        db.put("Царенко", List.of(228228228));
        db.put("Кейнз",   List.of(20282028));

        printDB(db);                                          // вызов метода PrintDB

        Scanner sc = new Scanner(System.in, "Cp866"); // инициализация сканнера с поддержкой альтернативной кодировки
        System.out.println("Введите фамилию: ");               // приглашение
        String name = sc.next();                                // ввод строки в терминал
        sc.close();                                            // закрытие сканнера 
        printSub(db, name);                                   // вызов метода PrintDB
    }

    public static void printDB(Map<String, List<Integer>> db) { // метод PrintDB (реклама писателей-фантастов в терминал) возвращение множества ключей
        for (String human : db.keySet()) {                     // выбрать значения по ключу
            System.out.print("Фамилия: " + human);            // вывод в терминал
            for (Integer phone : db.get(human)) {            // вывод значения
                System.out.print(" " + phone);
            }
            System.out.println("");                        // пустая строка
        }
    }

    public static void printSub(Map<String, List<Integer>> db, String human) {      // метод PrintSub
        if (db.containsKey(human)) {                                               // проверка по ключу (фамилия)
            Integer count = 0;                                                    // инициализация счетчика (порядковый номер... эээ...  номера телефона)
            for (Integer phone : db.get(human)) {                                // 
                count++;                                                        // инкремент счетчика
                System.out.printf(" Tel.no. %d: %d,", count, phone);    // вывод форматированного результата
            }
            System.out.println("");                                        // пустая строка
        } else {                                                            // если совпадений нет
            System.out.println("Данный индивид не найден. \n");                   
        }
    }
}

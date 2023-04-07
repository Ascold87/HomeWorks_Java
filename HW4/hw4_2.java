// Java: знакомство и как пользоваться базовым API (семинары)
// Урок 4. Хранение и обработка данных ч1: приоритетные коллекции

// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList; // импорт коллекции LinkedList
import java.util.Scanner;   // импорт сканнера

public class hw4_2 {     // обьявление класса
    public static void main(String[] args) {   // обьявление гл. метода
        Scanner sc = new Scanner(System.in);  // инициализация сканнера
        String str = "";                     // обьявление строки
        String element = "";                // обьявление строки
        LinkedList<String> list = new LinkedList<>();  // инициализация нового листа
        while (!str.equals("0")) {
            System.out.println("Доступные комманды для создания списка:");
            System.out.println("1) ввести и поместить элемент в конец очереди (enqueue) :");
            System.out.println("2) получить 1й элемент из очереди и удалить его (dequeue) :");
            System.out.println("3) получить 1й элемент из очереди без удаления (first) :");
            System.out.println("0) вывести список");
            System.out.print("Введите номер команды: ");
            str = sc.nextLine();
            switch (str) {
                case ("1"):
                    System.out.println("Введите элемент:");
                    str = sc.nextLine();         // ввод в терминале считывает сканнер
                    list = enqueue(list, str);  // поставить эл-т в очередь
                    break;                     // прерывание 
                case ("2"):
                    if (list.isEmpty()) {                        // если лист пуст -
                        System.out.println("Лист пуст.\n");  // - вывести информацию об этом
                    } else {
                        element = list.get(0);
                        list = dequeue(list);           // вывести эл-т из очереди
                        System.out.print("Первый элемент списка: ");
                        System.out.println(element);  // вывод элемента
                        break;
                    }
                case ("3"):
                    element = first(list);          // получить 1й элемент
                    System.out.print("Первый элемент списка: ");
                    System.out.println(element);  // вывод элемента
                    break;                       // прерывание 
            }
            System.out.println("Список");
            System.out.println(list); // вывод списка
        }
        sc.close();                 // закрытие сканнера
    }

    public static LinkedList<String> enqueue(LinkedList<String> list, String str) { // обьявление метода "add"
        list.add(str);
        return list;
    }

    public static LinkedList<String> dequeue(LinkedList<String> list) { // обьявление метода "remove"
        list.remove(0);
        return list;
    }

    public static String first(LinkedList<String> list) {    // обьявление метода  "first = get index 0"
        String firstElem = (String) list.get(0);
        return firstElem;
    }
}
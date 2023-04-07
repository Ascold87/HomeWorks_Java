// Java: знакомство и как пользоваться базовым API (семинары)
// Урок 4. Хранение и обработка данных ч1: приоритетные коллекции

// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;  // импорт коллекции LinkedList

public class hw4_1 {                                                 // обьявление класса
    public static void main(String[] args) {                       // обьявление гл. метода
        LinkedList<Integer> llist = new LinkedList<>();           // создание листа с обобщением integer
        System.out.println("\nПрограмма создает и переворачивает числовой список"); // инфо
        for (int i = 0; i < 10; i++) {                         // цикл от 1 до 10, который -
            llist.add(i+1);                                   // - в список добавляет номер индекса от 1 до 10
        }
        System.out.println("Созданный список: " + llist);   // вывод результата на терминал
        System.out.print("Перевернутый список: ");             
        System.out.println(ReverseList(llist));         // вызов функции к llist, и вывод рез. на терминал. ***
    }

    public static LinkedList<Integer> ReverseList(LinkedList<Integer> llist) {  // обьявление метода reverselist
        LinkedList<Integer> revlist = new LinkedList<>();                      // создание нового revlist
        revlist.addAll(llist);                                                // добавление всего из llist
        for (int i = 0; i < llist.size(); i++) {                             // цикл от 1 до "размер llist", который
            llist.set(i, revlist.get(llist.size() - 1 - i));                // переопределяет индексы
        }
        return llist;                                                     // переопределяет индексы
    }
}
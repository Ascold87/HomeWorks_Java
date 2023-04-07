// Java: знакомство и как пользоваться базовым API (семинары)
// Урок 5. Хранение и обработка данных ч2: множество коллекций Map

// 2.  Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности (чего?)
// Дан список сотрудников:
// Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова
// Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hw5_2 {
    public static void main(String[] args) {                     // гл.метод

        Map<Integer, List<String>> db = new HashMap<>();        // инициализация HashMap с именем db
        db.put(1, List.of("Иван", "Иванов"));        // список
        db.put(2, List.of("Светлана", "Петрова"));
        db.put(3, List.of("Кристина", "Белова"));
        db.put(4, List.of("Анна", "Мусина"));
        db.put(5, List.of("Анна", "Крутова"));
        db.put(6, List.of("Иван", "Юрин"));
        db.put(7, List.of("Петр", "Лыков"));
        db.put(8, List.of("Павел", "Чернов"));
        db.put(9, List.of("Петр", "Чернышов"));
        db.put(10, List.of("Мария", "Федорова"));
        db.put(11, List.of("Марина", "Светлова"));
        db.put(12, List.of("Мария", "Савина"));
        db.put(13, List.of("Мария", "Рыкова"));
        db.put(14, List.of("Марина", "Лугова"));
        db.put(15, List.of("Анна", "Владимирова"));
        db.put(16, List.of("Иван", "Мечников"));
        db.put(17, List.of("Петр", "Петин"));
        db.put(18, List.of("Иван", "Ежов"));

        ArrayList<String> array = new ArrayList<>();   // инициализация ArList "array"
        for (int i : db.keySet()) {                   // цикл forEach выбрать все i из db
            array.addAll(db.get(i));                 // добавить в массив
        }

        Map<String, Integer> huMap = new HashMap<>();           // инициализация HashMap "men" с обобщением <Строка, Целое>
        for (int i = 0; i < array.size(); i = i + 2) {         // цикл for, прогон всех i до (размер массива) со сдвоенным инкрементом (пропуск фамилии)
            if (huMap.containsKey(array.get(i))) {            // если men содержит ключ по индексу i, то
                huMap.replace(array.get(i), huMap.get(array.get(i)) + 1);  // заменить запись
            } else {
                huMap.put(array.get(i), 1);         // добавить запись со значением 1
            }
        }

        List<String> sortList = new ArrayList<>();  // инициализация отсортированного массива
        String key = "";                            // объявление Cтроки key
        
        while (!huMap.isEmpty()) {       // пока 'men' не пуст
            int count = 0;              // счетчик
            for (String nameKey : huMap.keySet()) {    // цикл forEach выбрать все nameKey из men
                if (huMap.get(nameKey) > count) {     // если ключ больше счетчика
                    count = huMap.get(nameKey);      // счетчик = количество повторов
                    key = nameKey;                   
                }
            }
            sortList.add(key + " - " + Integer.toString(huMap.get(key))); // добавить в финальный список (ключ-cтрока и число)
        huMap.remove(key);                                       // удалить key
        }
        System.out.println("\nСписок тривиальных имён.");
        System.out.println(sortList);                          // вывод отсортированного списка
    }
}

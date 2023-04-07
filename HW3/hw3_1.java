// Урок 3. Коллекции JAVA: Введение
// 1. Реализовать алгоритм сортировки слиянием.

import java.util.ArrayList;

public class hw3_1 {
    public static void main(String[] args) {
    int array[] = {0};
    int left;
    int mid;
    int right;
    ArrayList<Integer> list = new ArrayList<>(); 
    int lengthLeft = mid - left + 1;  // вычисляем длину
    int lengthRight = right - mid;
    
    int leftArray[] = new int[lengthLeft]; // создаем временные подмассивы
    int rightArray[] = new int[lengthRight];
    
    for (int i = 0; i < lengthLeft; i++) // копируем отсортированные массивы во временные
        leftArray[i] = array[left + i];
    for (int i = 0; i < lengthRight; i++)
        rightArray[i] = array[mid + i + 1];
    
    int leftIndex = 0; // итераторы содержат текущий индекс временного подмассива
    int rightIndex = 0;
   
    for (int i = left; i < right + 1; i++) {  // копируем из leftArray и rightArray обратно в массив
        if (leftIndex < lengthLeft && rightIndex < lengthRight) { // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
        
        else if (leftIndex < lengthLeft) { // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            array[i] = leftArray[leftIndex];
            leftIndex++;
        }
        
        else if (rightIndex < lengthRight) { // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            array[i] = rightArray[rightIndex];
            rightIndex++;
        }
    }
}
}

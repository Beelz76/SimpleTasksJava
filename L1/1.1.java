/*Дан массив. Удалить из него нули и после каждого числа, оканчивающего на 5,вставить 1*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {43, 10, 0, 15, 32, 65, 0, 26, 11, 6, 5};
        System.out.println("Начальный массив: " + Arrays.toString(arr));
        int newArrLength = 0; //Длина нового массива
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArrLength++;
            }
            if (arr[i] % 10 == 5) {
                newArrLength++;
            }
        }
        
        int[] newArr = new int[newArrLength]; //Создаем новый массив
        int index = 0; //Индексы элементов в новом массиве
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[index++] = arr[i];
            }
            if (arr[i] % 10 == 5) {
                newArr[index++] = 1;
            }
        }
        
        System.out.println("Конечный массив: " + Arrays.toString(newArr));
    }
}
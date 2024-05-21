/*Сформировать одномерный массив случайным образом. Определить количествочетных элементов массива, стоящих на четных местах.*/

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("Массив: " + Arrays.toString(arr));
        int count = 0; //Счетчик

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 & i % 2 == 1) {
                count++;
            }
        }

        System.out.println("Кол-во четных элементов массива, стоящих на четных местах = " + count);
    }
}
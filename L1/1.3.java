/*Дан двумерный массив. Сделать из него 2 одномерных: в одном – четные элементы двумерного массива, в другом – нечетные.*/

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[5][5];
        int evenArrLength = 0; //Длина массива с четными элементами
        int oddArrLength = 0; //Длина массива с нечетными элементами
        
	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(100);
                if (arr[i][j] % 2 == 0) {
                    evenArrLength++;
                } else {
                    oddArrLength++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int[] evenArr = new int[evenArrLength]; //Массив с четными элементами
        int[] oddArr = new int[oddArrLength]; //Массив с нечетными элементами
        int evenIndex = 0, oddIndex = 0; //Индексы элементов в каждом массиве

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 == 0) {
                    evenArr[evenIndex++] = arr[i][j];
                } else {
                    oddArr[oddIndex++] = arr[i][j];
                }
            }
        }

        System.out.println("\nМассив с четными числами: " + Arrays.toString(evenArr));
        System.out.println("Массив с нечетными числами: " + Arrays.toString(oddArr));
    }
}
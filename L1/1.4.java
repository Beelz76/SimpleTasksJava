/*Дан двумерный массив. Определить максимальный среди положительных элементов, минимальный среди отрицательных элементов и поменять их местами*/

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(-50, 50);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int max = arr[0][0], min = arr[0][0];
        int maxRow = 0, maxCol = 0, minRow = 0, minCol = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] >= 0 & arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
                if (arr[i][j] < 0 & arr[i][j] < min) {
                    min = arr[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }

        System.out.println("\nМаксимальный среди положительных: " + max);
        System.out.println("Минимальный среди отрицательных " + min + "\n");
        arr[maxRow][maxCol] = min;
        arr[minRow][minCol] = max;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
    }
}
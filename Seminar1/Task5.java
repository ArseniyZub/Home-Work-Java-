// 4. Задать одномерный массив и найти в нем минимальный и максимальный элементы;

import java.util.Scanner;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        MinMax(arr);
    }

    private static void MinMax(int[] arr) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            min = arr[i];
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}

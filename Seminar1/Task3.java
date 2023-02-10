// 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, 
// и числа меньшие 6 умножить на 2;

import java.util.Random;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1, 15);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(change(arr)));
    }

    private static int[] change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 7) {
                arr[i] *= 2;
            }
        }
        return arr;
    }
}

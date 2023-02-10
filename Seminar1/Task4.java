// 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами 
// (можно только одну из диагоналей, если обе сложно). 
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
// то есть [0][0], [1][1], [2][2], …, [n][n];

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        printt(arr);
        System.out.println();
        printt(cross(arr));
    
    }
    private static int[][] cross(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                } 
            }
        }
        return arr;
    }
    
    private static void printt(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

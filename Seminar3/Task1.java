// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

package Seminar3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int value = r.nextInt(1, 10);
            list.add(value);
        }
        System.out.println(list);

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer value = iterator.next();
            if (value % 2 == 0) {
                iterator.remove();
            }
        }   
        System.out.println(list);
    }
}

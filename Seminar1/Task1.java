/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
import java.util.Scanner;
 
public class Task1 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            
        if (isSumBetween10And20(a, b)) {
            System.out.println("Yes");
        } else { 
            System.out.println("No");
        }
    }


    private static boolean isSumBetween10And20(int a, int b) {
        if (a + b > 10 && a + b < 20) {
            return true;
        } else {
            return false;
        }
    }


    private static boolean isPositive(int x) {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }
    

    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(source);
        }
    }
    

    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        else if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
    

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initalValue;
        }
        return arr;
    }
    

    private static String findCommonPrefix(String[] source) {
        /** Найти общий префикс среди слов из одного массива.
         * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
         */
    String prefix = source[0];
    for (var str : source)
        while (str.indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1); 
            if (prefix.isEmpty())
                return "";
        }
    return prefix;
    }
}




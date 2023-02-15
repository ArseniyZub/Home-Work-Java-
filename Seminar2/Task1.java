// 1. Создать метод, который проверяет, является ли строка палиндромом.
// Палиндром - шалаш
package Seminar2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        char[] lineB = line.toCharArray();
        if (palindrome(lineB)) {
            System.out.println("Это слово палиндром");
        } else {
            System.out.println("Это слово не палиндром");
        }

    }

    public static boolean palindrome(char[] line) {
        int c1 = 0;
        int c2 = line.length - 1; 
        while (c2 > c1) {
            if (line[c1] != line[c2]) {
                return false;
            } 
            c1++;
            c2--;
        }
        return true;
    }
}

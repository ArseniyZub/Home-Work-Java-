package Seminar4;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> arr = new ArrayList<>();
        boolean run = true;

        while(run) {
            String line = in.nextLine();
            String[] split = line.split("~");
            String word = split[0];
            String numString = split[1];
            int number = Integer.parseInt(numString);

            if (word.toLowerCase().equals("print")) {
                if (arr.isEmpty()) {
                    System.out.println("Пока тут ничего нет");
                } else if (arr.contains(arr.get(number)) && arr.get(number) != null) {
                    System.out.println("-> " + arr.get(number));
                } else {
                    System.out.println("Тут пусто");
                }
            } else if (word.toLowerCase().equals("del")) {
                arr.remove(number);
            } else if (word.toLowerCase().equals("exit")) {
                run = false;
            } else {
                for (int i = 0; i < number; i++) {
                    if (!arr.contains(i)) { 
                        arr.add(i, null);
                    }
                }
                arr.add(number, word);
            }
        }
    }
}

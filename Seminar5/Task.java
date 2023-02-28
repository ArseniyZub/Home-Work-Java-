/*
 * Написать метод, определяющую правильность расстановки скобок в выражении.
 * Могут содержаться следующие скобки: ()[]{}<>
 * () -> true
 * []{}((<>)) -> true
 * ) -> false
 * [) -> false
 * []{}(<)> -> false
 */

package Semiar5;
import java.util.*;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if (isCorrectParentheses(line)) {
            System.out.println("Все верно!");
        } else {
            System.out.println("Вы где-то ошиблись");
        }
    }


    private static boolean isCorrectParentheses(String parentheses) {
        Map<Character, Character> brac = new HashMap<>();
        brac.put(')', '(');
        brac.put(']', '[');
        brac.put('}', '{');
        brac.put('>', '<');

        Deque<Character> stack = new LinkedList<>();
        for (Character i : parentheses.toCharArray()) {
            if (brac.containsValue(i)) {
                stack.push(i);
            } else if (brac.containsKey(i)) {
                if (stack.isEmpty() || stack.pop() != brac.get(i)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

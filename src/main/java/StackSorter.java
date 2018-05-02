import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackSorter {
    public static void sort(Deque<Integer> stack) {
        if (stack.isEmpty()) return;
        Deque<Integer> helpStack = new ArrayDeque<>();

        while (!stack.isEmpty()) {
            Integer current = stack.pop();
            while (!helpStack.isEmpty() && current < helpStack.peek()) {
                stack.push(helpStack.pop());
            }
            helpStack.push(current);
        }

        while (!helpStack.isEmpty()) {
            stack.push(helpStack.pop());
        }
    }
}

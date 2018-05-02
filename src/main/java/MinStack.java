import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack<T extends Comparable<T>> {

    private final Deque<T> dataStack = new ArrayDeque<>();
    private final Deque<T> minStack = new ArrayDeque<>();

    public void push(T t) {
        dataStack.push(t);
        if (minStack.isEmpty() || t.compareTo(minStack.peek()) < 0) {
            minStack.push(t);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public T pop() {
        minStack.pop();
        return dataStack.pop();
    }

    public T peek() {
        return dataStack.peek();
    }

    public T min() {
        return minStack.peek();
    }


}

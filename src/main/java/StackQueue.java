import java.util.ArrayDeque;
import java.util.Deque;

public class StackQueue {

    public static class MyQueue {

        private static final Deque<Integer> inStack = new ArrayDeque<>();
        private static final Deque<Integer> outStack = new ArrayDeque<>();
        private int size = 0;

        public MyQueue() {
            // do intialization if necessary
        }

        /*
         * @param element: An integer
         * @return: nothing
         */
        public void push(int element) {
            // write your code here
            inStack.push(element);
            size++;
        }

        /*
         * @return: An integer
         */
        public int pop() {
            if (size < 1) return -1;
            // write your code here
            transfer();
            size--;
            return outStack.pop();
        }

        /*
         * @return: An integer
         */
        public int top() {
            // write your code here
            if (size < 1) return -1;
            // write your code here
            transfer();
            return outStack.peek();
        }

        private void transfer() {
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }
        }
    }
}

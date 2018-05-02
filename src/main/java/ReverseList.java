import java.util.Deque;
import java.util.LinkedList;

public class ReverseList {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if (head == null || head.next == null) return head;

        Deque<ListNode> stack = new LinkedList<>();
        ListNode node = head;
        head = null;
        do {
            stack.push(node);
            node = node.next;
        } while (node != null);

        while (!stack.isEmpty()) {
            if (node != null) {
                node.next = stack.peek();
            }
            node = stack.pop();

            if (head == null) {
                head = node;
            }
        }
        node.next = null;
        return head;

    }

}

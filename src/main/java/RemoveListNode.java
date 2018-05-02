import java.util.LinkedList;
import java.util.List;

public class RemoveListNode {

    /**
     * @param head: a ListNode
     * @param val:  An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        if (head == null) return head;

        if (head.next == null) {
            return head.val == val ? null : head;
        }


        List<ListNode> list = new LinkedList<>();
        ListNode curr = head;
        while (curr != null) {
            if (curr.val != val) {
                list.add(curr);
            }
            curr = curr.next;
        }


        if (list.size() > 0) {
            ListNode prev = null;
            for (ListNode node : list) {
                if (prev == null) {
                    prev = node;
                } else {
                    prev.next = node;
                    prev = node;
                }
            }
            prev.next = null;
        }

        return list.size() > 0 ? list.get(0) : null;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

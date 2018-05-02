import java.util.LinkedList;
import java.util.List;

public class ListPartition {
    /**
     * @param head: The first node of linked list
     * @param x:    An integer
     * @return: A ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        ListNode lHead = null, lCur = null, hHead = null, hCur = null;
        while (head != null) {
            if (head.val < x) {
                if (lCur == null) {
                    lHead = head;
                } else {
                    lCur.next = head;
                }
                lCur = head;
            } else {
                if (hCur == null) {
                    hHead = head;
                } else {
                    hCur.next = head;
                }
                hCur = head;
            }
            head = head.next;
        }
        if (lHead != null) {
            lCur.next = hHead;
        }
        if (hHead != null) {
            hCur.next = null;
        }


        return lHead == null ? hHead : lHead;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

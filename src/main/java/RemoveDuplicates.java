import java.util.Arrays;

public class RemoveDuplicates {
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        int length;
        if (nums == null || (length = nums.length) < 1) {
            return 0;
        }

        if (length < 2) return length;

        int base = 0;
        for (int cur = 1; cur < length; cur++) {
            if (nums[base] != nums[cur]) {
                nums[++base] = nums[cur];
            }
        }
        return base + 1;
    }

    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates2(int[] nums) {
        // write your code here
        int length;
        if (nums == null || (length = nums.length) < 1) {
            return 0;
        }

        if (length < 2) return length;

        int base = 0, count = 1;
        for (int cur = 1; cur < length; cur++) {
            if (nums[base] != nums[cur]) {
                count = 1;
                nums[++base] = nums[cur];
            } else if (nums[base] == nums[cur] && count < 2) {
                count++;
                nums[++base] = nums[cur];
            }
        }
        return base + 1;
    }

    /**
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null || head.next == null) return head;

        ListNode base = head, cur = head.next;
        while (cur != null) {
            if (base.val != cur.val) {
                base.next = cur;
            }
            cur = cur.next;
        }
        base.next = null;

        return head;
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

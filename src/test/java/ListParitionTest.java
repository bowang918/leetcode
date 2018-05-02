import org.junit.Test;

public class ListParitionTest {

    @Test
    public void test() {
        ListPartition.ListNode n1 = new ListPartition.ListNode(1);
        ListPartition.ListNode n2 = new ListPartition.ListNode(1);
        n1.next = n2;

        ListPartition.ListNode r = new ListPartition().partition(n1, 0);
        while (r != null) {
            System.out.println(r.val);
            r = r.next;
        }
    }

    @Test
    public void test1() {
        ListPartition.ListNode n1 = new ListPartition.ListNode(1);
        ListPartition.ListNode n2 = new ListPartition.ListNode(4);
        ListPartition.ListNode n3 = new ListPartition.ListNode(3);
        ListPartition.ListNode n4 = new ListPartition.ListNode(2);
        ListPartition.ListNode n5 = new ListPartition.ListNode(5);
        ListPartition.ListNode n6 = new ListPartition.ListNode(2);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        ListPartition.ListNode r = new ListPartition().partition(n1, 3);
        while (r != null) {
            System.out.println(r.val);
            r = r.next;
        }
    }
}

package niuke;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-13 10:14
 */
public class ListNode {

    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k < 2) {
            return head;
        }
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode cur = head;
        ListNode pre = node,tmp;
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        for (int i = 0; i < count / k; i++) {
            for (int j = 1; j < k; j++) {
                tmp = cur.next;
                cur.next = tmp.next;
                tmp.next = pre.next;
                pre.next = tmp;
            }
            pre = cur;
            cur = cur.next;
        }
        return node.next;
    }
}
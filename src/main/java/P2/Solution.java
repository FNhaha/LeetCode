package P2;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while (true) {
            if (l1 == null && l2 == null) {
                cur.val = carry;
            } else if (l1 == null) {
                cur.val = l2.val + carry;
            } else if (l2 == null) {
                cur.val = l1.val + carry;
            } else {
                cur.val = l1.val + l2.val + carry;
            }
            carry = cur.val / 10;
            cur.val = cur.val % 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (l1 == null && l2 == null && carry == 0) {
                break;
            } else  {
                cur.next = new ListNode(0);
                cur = cur.next;
            }
        }
        return res;
    }

    public ListNode generateListNode(int x) {
        return new ListNode(x);
    }
}

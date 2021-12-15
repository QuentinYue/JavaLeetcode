public class mergeTwoLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode merge(ListNode l1, ListNode l2){
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l1 != null) {
            return l1;
        }

        ListNode cur1 = null;
        ListNode cur2 = null;
        ListNode head = null;//记录头结点(最小节点)
        if (l1.val <= l2.val) {
            cur1 = l1;
            head = l1;
            cur2 = l2;
        }
        if (l1.val > l2.val) {
            cur1 = l2;
            head = l2;
            cur2 = l1;
        }

        ListNode next = null;
        ListNode pre = null; // 记录值小的节点
        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {v
                pre = cur1;
                cur1 = cur1.next;
            }
            if (cur1.val > cur2.val) {
                next = cur2.next;
                pre.next = cur2;
                cur2.next = cur1;
                pre = cur2;
                cur2 = next;
            }
        }

        if (cur1 == null) {
            pre.next = cur2;
        }
        if (cur2 == null) {
            pre.next = cur1;
        }
        return head;
    }

    public static void main(String[] args) {
            ListNode l1 = new ListNode();


    }
}

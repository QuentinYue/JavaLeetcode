public class reverse_LinkedList_206 {
}

/*
//重在理解
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head.next;
        head.next = null;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = head;
            head = temp;
            temp = next;
        }
        return head;//head是null 的前一个 node,所以 head 是新顺序链表的头头
    }
}
 */

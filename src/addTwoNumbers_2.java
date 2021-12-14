public class addTwoNumbers_2 {
    public static void main(String[] args){

    }
}

/*
Concise method:
//Good performance
class Solution {
    int carry = 0; // global!!
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null && carry == 0){
            return null;
        }
        int val1 = (l1 == null) ? 0 : l1.val;
        int val2 = (l2 == null) ? 0 : l2.val;
        int sum = val1 + val2 + carry;
        carry = sum / 10;
        l1 = (l1 == null) ? null : l1.next;
        l2 = (l2 == null) ? null : l2.next;
        ListNode res = new ListNode(sum % 10, addTwoNumbers(l1, l2));
        return res;
    }
}

土法改进:
//新链表
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        int carry = 0;
        int sum = 0;
        while(l1 != null || l2 != null){
            int val1 = (l1 == null) ? 0 : l1.val;
            int val2 = (l2 == null) ? 0 : l2.val;
            sum = val1 + val2 + carry;
            if(sum >= 10){
                carry = 1;
                sum -= 10;
            }
            else{
                carry = 0;
            }
            cur.next = new ListNode(sum);
            cur = cur.next;
            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
        }
        if(carry == 1){
            ListNode newNode = new ListNode(1, null);
            cur.next = newNode;
        }
        return head.next;
    }
}



土法炼钢:
//依托于原l1
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = l1;
        ListNode temp = null;
        int carry = 0;
        int sum = 0;
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + carry;
            if(sum >= 10){
                carry = 1;
                sum -= 10;
            }
            else{
                carry = 0;
            }
            l1.val = sum;
            if(l1.next == null){
                temp = l1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 == null){// LinkedList 1 is shorter
            temp.next = l2;
            while(l2 != null){
                if(l2.next == null){
                    temp = l2;
                }
                sum = l2.val + carry;
                if(sum >= 10){
                    carry = 1;
                    sum -= 10;
                }
                else{
                    carry = 0;
                }
                l2.val = sum;
                l2 = l2.next;
            }
        }
        else{// LinkedList 2 is shorter
            while(l1 != null){
                if(l1.next == null){
                    temp = l1;
                }
                sum = l1.val + carry;
                if(sum >= 10){
                    carry = 1;
                    sum -= 10;
                }
                else{
                    carry = 0;
                }
                l1.val = sum;
                l1 = l1.next;
            }
        }
        if(carry == 1){
            ListNode newNode = new ListNode(1, null);
            temp.next = newNode;
        }
        return head;
    }
}
 */
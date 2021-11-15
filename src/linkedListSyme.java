import java.util.Stack;

public class linkedListSyme {
    public static class Node{
        public int value;
        public Node next;

        public Node(int data){
            this.value = data;
        }
    }

    public static boolean isSymmeShStack(Node head){ //纯用栈
        Stack<Node> s1 = new Stack<Node>();
        Node curt = head;

        while( curt != null){   //全部链表节点 push 入栈
            s1.push(curt);
            curt = curt.next;
        }

        while(head != null){    //从第一个节点开始,一一与 pop 出栈的元素比对
            if(head.value != s1.pop().value){
                return false;   //只要一个对不上就不是回文
            }
            head = head.next;
        }
        return true;
    }

    public static boolean isSymmeByStackAPoint(Node head){//栈 + 快慢指针
        if(head == null || head.next ==null){
            return true;
        }

        Node cur = head;
        Node right = head.next;

        if(cur.next != null && cur.next.next != null){ //right 会指向中点 or 下中点(偶数个)
            cur = cur.next.next;
            right = cur.next;
        }

        Stack<Node> stack = new Stack<Node>();
        while(right != null){ //下半截入栈
            stack.push(right);
            right = right.next;
        }

        while(!stack.isEmpty()){
            if(head.value != stack.pop().value){ //注意是对比 value !!!!
                return false;
            }
            head = head.next;
        }

        return true;
    }

    public static void main(String[] args){


    }
}

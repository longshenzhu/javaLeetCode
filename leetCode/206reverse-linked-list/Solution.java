import java.util.Stack;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)return head;

        //递归到最后一个节点再回溯，cur指向新链表
        ListNode cur = reverseList(head.next);
        //反转指向
        head.next.next = head;
        //断开原来的指向
        head.next = null;

        return cur;
    }

    // 优秀的迭代
    // public ListNode reverseList(ListNode head) {
    //     if(head == null || head.next == null)return head;

    //     ListNode pre = null;
    //     ListNode cur = head;
    //     ListNode tempNode = null;
    //     while(cur != null){
    //         //暂存下一个节点的指针
    //         tempNode = cur.next;

    //         //反转指向
    //         cur.next = pre;

    //         //向下推进
    //         pre = cur;
    //         cur = tempNode;
    //     }
    //     return pre;
    // }

    // 自己写的迭代法
    // public ListNode reverseList(ListNode head) {
    //     if(head == null)return null;
    //     Stack<ListNode> stack = new Stack<>();
    //     while(head != null){
    //         stack.push(new ListNode(head.val));
    //         head = head.next;
    //     }
    //     ListNode curNode = head = stack.pop();
    //     while(!stack.isEmpty()){
    //         curNode.next = stack.pop();
    //         curNode = curNode.next;
    //     }
    //     return head;
    // }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
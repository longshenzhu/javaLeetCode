/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        //边界处理
        ListNode cur = head.next.next;
        head.next.next = head;
        head = head.next;
        head.next.next = null;
        //迭代
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = head;
            //向下推进
            head = cur;
            cur = temp;
        }
        return head;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
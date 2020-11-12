

class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null) return head;
        if(n <= m || m < 0 ) return null;

        ListNode cur = head;
        ListNode prev = null;
        while(m > 1){
            prev = cur;
            cur = cur.next;

            m --;
            n --;
        }
        //记录两个位置
        ListNode tail = prev;      
        ListNode mNode = cur;      //第m个节点处指针

        ListNode temp = null;
        while(cur != null && n > 0){
            temp = cur.next;
            cur.next = prev;

            prev = cur;
            cur = temp;
            n --;
        }
        //连接
        if(tail != null)tail.next = prev;
        mNode.next = cur;

        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
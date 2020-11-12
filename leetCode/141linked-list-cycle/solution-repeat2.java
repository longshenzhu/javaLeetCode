class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode low = head, fast = head;
        while(fast != null && fast.next != null){
            low = low.next;
            fast = fast.next.next;
            if(low == fast)return true;
        }
        return false; 
    }

    public class ListNode {
        int val;                                                                                                                                                                     
        ListNode next;
        ListNode(int x) { 
            val = x; 
            next = null;
        }
    }
}
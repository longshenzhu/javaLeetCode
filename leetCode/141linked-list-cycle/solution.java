/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)return false;
        ListNode low = head;
        ListNode fast = head.next;
        while(fast != null){
            low = low.next;
            fast = fast.next.next;
            if(fast == low){
                return true;
            }
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
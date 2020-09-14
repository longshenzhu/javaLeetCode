/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);
        ListNode curNode = head;
        int carry = 0;
        while(l1 != null || l2 != null){
            int x = l1 == null? 0 : l1.val;
            int y = l2 == null? 0 : l2.val;
            int sum = x + y + carry;
            curNode.next = new ListNode(sum % 10);
            curNode = curNode.next;
            carry = sum > 9? 1 : 0;

            l1 = l1 == null? null : l1.next;
            l2 = l2 == null? null : l2.next;
        }
        if(carry == 1)curNode.next = new ListNode(1);
        return head.next;


        // int promote = 0;  //是否向前进位置
        // ListNode sum = new ListNode(0);
        // ListNode p = sum;
        // while(l1 != null || l2 !=null){
        //     int cur= 0;
        //     if(l1 == null){
        //         cur = l2.val + promote;
        //         l1 = null;
        //         l2 = l2.next;
        //     }else if(l2 == null){
        //         cur = l1.val + promote;
        //         l1 = l1.next;
        //         l2 = null;
        //     }else if(l1 != null){
        //         cur = l1.val + l2.val + promote;
        //         l1 = l1.next;
        //         l2 = l2.next;
        //     }
        //     p.next = new ListNode(cur % 10);
        //     p = p.next;
        //     promote = cur > 9? 1 : 0;
            
        // }
        // if(promote == 1)p.next = new ListNode(1);
        // return sum.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
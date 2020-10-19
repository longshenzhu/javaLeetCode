
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode pre = head;
        ListNode post = pre.next;

        while(post!= null){
            post = post.next;
            pre.next.next = pre;
            pre.next = post;

            // if(post != null){
            //     post = post.next;
            //     pre = pre.next;
            // }
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


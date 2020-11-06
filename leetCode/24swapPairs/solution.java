
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
        ListNode node0 = new ListNode(0);
        node0.next = head;

        ListNode temp = node0;
        while(temp.next != null && temp.next.next !=null){
            ListNode pre = temp.next;
            ListNode post = temp.next.next;

            temp.next = post;
            pre.next = post.next;
            post.next = pre;
            temp = pre;
        }
        return node0.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


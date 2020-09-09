import java.util.Stack;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curNode = head;
        while(curNode != null){
            stack.push(curNode.val);
            curNode = curNode.next;
        }

        int[] ans = new int[stack.size()];
        int i=0;
        while(!stack.isEmpty()){
            ans[i++] = stack.pop();
        }
        return ans;
    }

    public class ListNode { 
        int val; 
        ListNode next; 
        ListNode(int x) { val = x; } 
    }
}


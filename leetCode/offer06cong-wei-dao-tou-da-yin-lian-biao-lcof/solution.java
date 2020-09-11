import java.util.ArrayList;
import java.util.Stack;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> temp = new ArrayList<>();
        recursion(head, temp);

        int[] ans = new int[temp.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = temp.get(i);
        }
        return ans;
        // Stack<Integer> stack = new Stack<>();
        // ListNode curNode = head;
        // while(curNode != null){
        //     stack.push(curNode.val);
        //     curNode = curNode.next;
        // }

        // int[] ans = new int[stack.size()];
        // int i=0;
        // while(!stack.isEmpty()){
        //     ans[i++] = stack.pop();
        // }
        // return ans;
    }

    public void recursion(ListNode curNode, ArrayList<Integer> temp){
        if(curNode == null)return;
        recursion(curNode.next, temp);
        temp.add(curNode.val);
    }

    public class ListNode { 
        int val; 
        ListNode next; 
        ListNode(int x) { val = x; } 
    }
}


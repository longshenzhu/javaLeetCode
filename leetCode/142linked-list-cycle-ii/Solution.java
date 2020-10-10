import java.util.HashSet;
import java.util.Set;

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

    //快慢指针法
    public ListNode detectCycle(ListNode head) {

        //fast = low + nb;
        //fast = 2*low;
        //重逢时 low走了nb，即n个环，fast走了2n个环
        ListNode fast = head,low = head;
        while(fast != null){
            if(fast.next == null)return null;
            low = low.next;
            fast = fast.next.next;

            //找到快慢指针重逢位置
            if(fast == low){
                ListNode ptr = head;
                while(low != ptr){
                    low = low.next;
                    ptr = ptr.next;
                }
                return ptr;
            }
        }
        return null;
    }

    // 哈希表记录法
    // public ListNode detectCycle(ListNode head) {
    //     Set<ListNode> visited = new HashSet<ListNode>();
    //     ListNode cur = head;
    //     while(cur != null){
    //         if(visited.contains(cur))return cur;
    //         visited.add(cur);

    //         cur = cur.next;
    //     }
    //     return null;
    // }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { 
            this.val = x;
            next = null;
        }
    }
    
}
class Solution {
    //方法一：哈希表记录，去重
    //方法二：双指针记录去重，指向重复的下一个节点
    //方法三：递归，删除所有头部的重复节点，返回不重复的第一个节点

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
        
        ListNode node0 = new ListNode(0);
        ListNode tail = node0;

        int repeatTime = 1;         //和当前节点相同值的个数
        while(head.next != null){
            if(head.val == head.next.val){
                repeatTime++;
                head = head.next;
            }else{
                if(repeatTime == 1){
                    //寻找tail.next
                    tail.next = new ListNode(head.val);
                    tail = tail.next;
                }
                repeatTime = 1;
                head = head.next;
            }
        }
        if(repeatTime == 1)tail.next = head;
        return node0.next;
    }

    //方法二
    // public ListNode deleteDuplicates(ListNode head) {
    //     if(head==null || head.next==null) {
    //         return head;
    //     }
    //     ListNode dummy = new ListNode(-1);
    //     dummy.next = head;
    //     ListNode a = dummy;
    //     ListNode b = head;
    //     while(b!=null && b.next!=null) {
    //         //初始化的时a指向的是哑结点，所以比较逻辑应该是a的下一个节点和b的下一个节点
    //         if(a.next.val!=b.next.val) {
    //             a = a.next;
    //             b = b.next;
    //         }
    //         else {
    //             //如果a、b指向的节点值相等，就不断移动b，直到a、b指向的值不相等 
    //             while(b!=null && b.next!=null && a.next.val==b.next.val) {
    //                 b = b.next;
    //             }
    //             a.next = b.next;
    //             b = b.next;
    //         }
    //     }
    //     return dummy.next;
    // }

    //递归
    // public ListNode deleteDuplicates(ListNode head) {
    //     if (head == null || head.next == null) {
    //         return head;
    //     }
    //     if (head.val == head.next.val) {
    //         while (head != null && head.next != null && head.val == head.next.val) {
    //             head = head.next;
    //         }
    //         return deleteDuplicates(head.next);
    //     } else {
    //         head.next = deleteDuplicates(head.next);
    //         return head;
    //     }
    // }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
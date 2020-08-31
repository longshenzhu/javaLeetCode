/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
//归并排序的思路
var mergeTwoLists = function(l1, l2) {
    var head = new ListNode();
    var cur = head;
    while(l1 || l2){
        if(l1.next == null){
            cur.next = l2;
            return head;
        }
        if(l2.next == null){
            cur.next = l1;
            return head;
        }
        if(l1.val < l2.val){
            cur.next = l1;
            l1 = l1.next;
        }else{
            cur.next = l2;
            l2 = l2.next;
        }
        cur = cur.next;
    }
    return head;
};

function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}
console.log(maxArea([2,7,11,15]));
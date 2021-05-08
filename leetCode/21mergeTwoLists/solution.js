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

//递归的写法都可以用循环来改写，代价会小一点
function merge(l1, l2){
    if(l1 == null){
        return l2;
    }
    if(l2 == null){
        return l1;
    }
    if(l1.val < l2.val){
        l1.next = merge(l1.next, l2);
        return l1;
    }else {
        l2.next = merge(l1, l2.next);
        return l2;
    }
}
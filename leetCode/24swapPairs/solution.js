/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */

var swapPairs = function(head) {
    var i = 1;
    var pre = head;
    var cur = head;
    while(pre && cur){
        if(i%2==1){
            cur = cur.next;
            i++;
            continue;
        }
        if(i==2){
            head = cur;
        }
        pre.next = cur.next;
        cur.next = pre;
        cur = pre.next;
        i++;
    }
    return head;
};

// var swapPairs = function(head) {
//     var i = 1;
//     head = head.next;
//     var preNode = {};
//     while(head){
//         console.log(head.val);
//         if(i%2==1){
//             preNode = head;
//             head = head.next;
//         }
//         head = head.next;
//         preNode.next.next = head;
//         preNode.next = head;
//         i++;
//     }
// };

function ListNode(val) {
    this.val = val;
    this.next = null;
}
console.log(twoSum([2,7,11,15],9));
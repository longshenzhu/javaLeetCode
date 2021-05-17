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

 //交换链表中相邻节点
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

var swapPairs1 = function(head) {
    if(!head || !head.next)return head;
    var dummyHead = new ListNode(0);
    dummyHead.next = head.next;

    var temp = dummyHead;
    var pre = temp.next;
    var post = temp.next.next;
    while(pre && post){
        // post.next
        // temp.next = post;
        pre.next = post.next;
        post.next = pre;
        temp = 
        
        temp = pre;
        
    }
    return dummyHead.next;
}
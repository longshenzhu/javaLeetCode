/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
var levelOrder = function(root) {
    if(root == null)return null;
    var queue = [];             //队列
    var res = [];
    queue.push(root);
    while(queue.length> 0){
        var len = queue.length;
        var curLevel = [];
        for(let i= 0;i < len; i++){
            var curNode = queue.shift();
            curLevel.push(curNode.val);
            curNode.left && queue.push(curNode.left);
            curNode.right && queue.push(curNode.right);
        }
        res.push(curLevel);
    }
    return res;
};
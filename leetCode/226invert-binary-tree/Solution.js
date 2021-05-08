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
 * @return {TreeNode}
 */
var invertTree = function(root) {
    //树的翻转：每个节点的左右节点都做一次翻转
    if(root== null || (root.left == null && root.right == null))return root;
    var { left, right } = root;
    root.left = invertTree(right);
    root.right = invertTree(left);
    return root;  
};
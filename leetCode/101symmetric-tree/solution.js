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
 * @return {boolean}
 */
var isSymmetric = function(root) {
    if(root == null) return true;
    const { left,right } = root;
    return dfs(left,right);

    function dfs(p, q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        return p.val == q.val && dfs(p.left, q.right) && dfs(p.right, q.left);
    }
};
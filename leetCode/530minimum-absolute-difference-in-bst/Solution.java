/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int res = Integer.MAX_VALUE;
    TreeNode pre = null;
    public int getMinimumDifference(final TreeNode root) {
        if(root == null || (root.left == null && root.right == null))return 0;
        MidTraversal(root);
        return res;
    }

    //中序遍历
    public void MidTraversal(final TreeNode cur){
        if(cur == null)return;

        if(cur.left != null) MidTraversal(cur.left);
        if(pre == null){
            pre = cur;
        }else{
            res = Math.min(res, cur.val - pre.val);
            pre = cur;
        }
        if(cur.right != null)MidTraversal(cur.right);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(final int x) { val = x; }
    }
}
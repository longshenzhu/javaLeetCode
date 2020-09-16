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

    // public TreeNode invertTree(TreeNode root) {
    //     if (root == null) {
    //         return root;
    //       }
    //       // 分别翻转左、右子树
    //       TreeNode left = invertTree(root.left);
    //       TreeNode right = invertTree(root.right);
    //       // 翻转自己
    //       root.left = right;
    //       root.right = left;
    //       return root;
    // }

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    public void invert(TreeNode curNode){
        if(curNode == null)return;
        //后续遍历法
        invert(curNode.left);
        invert(curNode.right);
        // if(curNode.left == null && curNode.right == null)return;
        // if(curNode.left != null)invert(curNode.left);
        // if(curNode.right != null)invert(curNode.right);

        TreeNode temp = curNode.left;
        curNode.left = curNode.right;
        curNode.right = temp;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
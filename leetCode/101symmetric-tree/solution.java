import java.util.ArrayDeque;
import java.util.Deque;

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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        return dfs(root.left, root.right);  
    }

    public boolean dfs(TreeNode leftTree,TreeNode rightTree){
        if(leftTree == null && rightTree == null){
            return true;
        }
        if(leftTree == null || rightTree == null){
            return false;
        }
        return leftTree.val == rightTree.val && dfs(leftTree.left,rightTree.right) && dfs(leftTree.right, rightTree.left);

        // if(leftTree == null && rightTree == null){
        //     return true;
        // }
        // else if(leftTree == null && rightTree != null){
        //     return false;
        // }
        // else if(leftTree != null && rightTree == null){
        //     return false;
        // }
        // else{
        //     if(leftTree.val != rightTree.val)return false;
        //     if(!dfs(leftTree.left,rightTree.right))return false;
        //     if(!dfs(leftTree.right, rightTree.left))return false;
        //     return true;
        // }
    }

    public class TreeNode {
        int val;                                                                                                                                                                     
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
} 
















































































































































         
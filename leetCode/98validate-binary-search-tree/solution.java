import sun.reflect.generics.tree.Tree;

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
    public boolean isValidBST(TreeNode root) {
        //中序遍历法，上个节点小于下个节点
        if(root.left != null){
            return inorder(root.left,root);
        }else if(root.right != null){
            return inorder(root,root.right);
        }
        return false;
        
    }

    private boolean inorder(TreeNode pre, TreeNode curNode) {
        //terminator
        if(pre.val> curNode.val){
            return false;
        }
        
        if(curNode.left != null) {
            if(!inorder(curNode.left, curNode)) return false;
        }
        if(curNode.right != null){
            if(!inorder(curNode, curNode.right)) return false;
        }
        return true;
	}

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
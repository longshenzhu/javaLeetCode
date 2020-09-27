import java.util.HashMap;
import java.util.Map;

import org.omg.PortableServer.POA;

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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length == 0)return null;
        int n = postorder.length;
        Map<Integer,Integer> inorderMap = new HashMap<>();
        TreeNode res = new TreeNode(postorder[n-1]);
        
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        TreeNode cur = res;
        Map<Integer,TreeNode> nodeMaps = new HashMap<>();
        nodeMaps.put(cur.val, cur);
        for (int i = n-2; i >= 0; i--) {
            if(inorderMap.get(postorder[i]) > inorderMap.get(postorder[i+1])){
                cur.right = new TreeNode(postorder[i]);
                cur = cur.right;
            }else if(inorderMap.get(postorder[i]) - inorderMap.get(postorder[i+1]) == -1) {
                cur.left = new TreeNode(postorder[i]);
                cur = cur.left;
            }else if(inorderMap.get(postorder[i]) - inorderMap.get(postorder[i+1]) == -2){
                nodeMaps.get(postorder[i+1]).left = new TreeNode(postorder[i]);
                cur = nodeMaps.get(postorder[i+1]).left;
            }
            nodeMaps.put(postorder[i], cur);
        }
        return res;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
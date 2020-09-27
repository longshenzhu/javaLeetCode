
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */

//参考：https://leetcode-cn.com/problems/binary-tree-level-order-traversal/solution/bfs-de-shi-yong-chang-jing-zong-jie-ceng-xu-bian-l/
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)return res;

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        
        while(!deque.isEmpty()){
            int curLevelSize = deque.size();
            List<Integer> curLevelVals = new ArrayList<Integer>();
            for (int i = 0; i < curLevelSize; i++) {
                TreeNode cur = deque.poll();
                curLevelVals.add(cur.val);
                if(cur.left != null){
                    deque.offer(cur.left);
                }
                if(cur.right != null){
                    deque.offer(cur.right);
                }
            }
            res.add(curLevelVals);
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
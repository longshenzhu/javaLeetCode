import java.util.Queue;

class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int res = 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            res ++;
            TreeNode cur = que.poll();
            if(cur.left == null) return res * 2;
            if(cur.right == null) return res * 2 + 1;
            que.offer(cur.left);
            que.offer(cur.right);
        }
    }
    //递归，非最优
    // public int countNodes(TreeNode root) {
    //     if(root == null) return 0;
    //     return 1 + countNodes(root.left) + countNodes(root.right);
    // }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
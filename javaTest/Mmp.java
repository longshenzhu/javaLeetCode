package javaLeetCode.javaTest;

import java.util.HashMap;
import java.util.Stack;

public class Mmp {
    // class TreeNode {
    //     public int val;
    //     public TreeNode left;
    //     public TreeNode right;

    //     TreeNode(int x) {
    //         val = x;
    //     }
    // }
    public static void main(final String[] args) {
        //twoSum1(new int[]{1,2,6,8},8);
        //[3,5,1,6,2,0,8,null,null,7,4]
        TreeNode root = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node6 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node0 = new TreeNode(0);
        TreeNode node8 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node4 = new TreeNode(4);

        node2.left = node7;
        node2.right = node4;

        node5.left = node6;
        node5.right = node2;

        node1.left = node0;
        node1.right = node8;

        root.left = node5;
        root.right = node1;

        Stack<TreeNode> pPath = new Stack<>();
        getPath(root, node6, pPath);

        System.out.println(pPath.toString());

        System.out.println("Hello vscode!");
    }

    public static int[] twoSum1(final int[] nums, final int target) {
        final int[] indexs = new int[2];

        // 建立k-v ，一一对应的哈希表
        final HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target - nums[i], i);
        }
        System.out.println(hash);
        return indexs;
    }

    public static void getPath(TreeNode curNode, TreeNode target, Stack<TreeNode> path) {
        if (curNode.val == target.val) {
            path.push(curNode);
            return;
        }

        if (curNode.left != null && path.size()== 0) {
            getPath(curNode.left, target, path);
            // if (curNode.left.val == path.peek().val) {
            //     path.push(curNode);
            //     return;
            // }
        }

        if (curNode.right != null && path.size()== 0) {
            getPath(curNode.right, target, path);
            // if (curNode.right.val == path.peek().val) {
            //     path.push(curNode);
            //     return;
            // }
        }
        if(path.size()> 0)path.push(curNode);
    }

    
}







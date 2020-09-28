
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public Node connect(Node root) {
        if(root == null)return null;
        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize= queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node cur = queue.poll();
                if(i+1< levelSize){
                    cur.next = queue.peek();
                }else{
                    cur.next = null;
                }
                if(cur.left != null)queue.offer(cur.left);
                if(cur.right != null)queue.offer(cur.right);
            }
        }
        return root;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
    
        public Node() {}
        
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
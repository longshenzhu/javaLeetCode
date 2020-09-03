import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 1){
            return nums;
        }
        int[] ans = new int[nums.length-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i< nums.length; i++){
            // if(!deque.isEmpty() && deque.peekFirst()){

            // }
        }
        return ans;
    }
}
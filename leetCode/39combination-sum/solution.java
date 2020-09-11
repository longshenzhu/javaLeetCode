import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if(candidates.length == 0)return ans;
        Arrays.sort(candidates);
        Deque<Integer> path = new ArrayDeque<>();
        backTracing(0,0, target, path, ans, candidates);
        return ans;
    }

    public void backTracing(int start,int sum, int target, Deque<Integer> path, List<List<Integer>> ans, int[] candidates){
        if(sum == target){
            ans.add(new ArrayList<Integer>(path));
            return;
        }
        if(sum > target){
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            path.addLast(candidates[i]);
            sum += candidates[i];
            start = i;
            backTracing(start,sum, target, path, ans, candidates);
            sum -= path.removeLast();
        }
        start ++;
    }
}
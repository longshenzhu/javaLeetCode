import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    //参考：https://leetcode-cn.com/problems/combination-sum-ii/solution/hui-su-suan-fa-jian-zhi-python-dai-ma-java-dai-m-3/
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> resItem = new ArrayList<>();
        Arrays.sort(candidates);
        int sum = 0;
        recursion(candidates, target, res, resItem, sum, 0);
        return res;
    }

    private void recursion(int[] candidates, int target, List<List<Integer>> res, List<Integer> resItem, int sum, int start) {
        //terminator
        if(sum == target){
            res.add(new ArrayList<>(resItem));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            //剪枝
            if(sum + candidates[i]> target)return;
            if(i > start && candidates[i] == candidates[i-1])continue;

            //process logic
            resItem.add(candidates[i]);

            //drill down
            recursion(candidates, target, res, resItem, sum + candidates[i], i+1);

            //restore states
            resItem.remove(resItem.size() - 1);
        }
    }

    
}
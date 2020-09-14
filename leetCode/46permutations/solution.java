import java.util.ArrayList;
import java.util.List;

//参考：https://leetcode-cn.com/problems/permutations/solution/hui-su-suan-fa-python-dai-ma-java-dai-ma-by-liweiw/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[]  status = new boolean[nums.length];
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        recursion(res, ans, status, nums);
        return ans;
    }

    public void recursion(List<Integer> res,List<List<Integer>> ans, boolean status[], int nums[]){
        if(res.size() == nums.length){
            ans.add(new ArrayList<>(res));      //注意：数组是引用，需要复制
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(status[i])continue;

            status[i] = true;
            res.add(nums[i]);
            recursion(res, ans, status, nums);
            
            status[i] = false;
            res.remove(res.size()-1);           //注意：不是删除第i个元素，而是最后一个
        }
        // int index  = 0;
        // while(index < nums.length){
        //     if(status[index]){
        //         index ++;
        //         continue;
        //     }
        //     status[index] = true;
        //     res.add(nums[index]);

        //     recursion(res, ans, status, nums);

        //     res.remove(res.size()-1);
        //     status[index] = false;
        //     index++;
        // }
        
    }
}
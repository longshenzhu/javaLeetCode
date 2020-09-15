import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> resItem = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        recusion(result, resItem, visited, nums);
        return result;
    }

    public void recusion(List<List<Integer>> result, List<Integer> resItem,boolean[] visited, int[] nums) {
        if(resItem.size() == nums.length){
            result.add(new ArrayList<>(resItem));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(visited[i])continue;
            //分析、加入减枝条件：排序后，深度遍历中出现相同的起点时，上一次起点还未使用，则会出现重复，应该剪枝
            if(i>0 && nums[i] == nums[i-1] && !visited[i-1]){
                continue;
            }

            resItem.add(nums[i]);
            visited[i] = true;
            recusion(result, resItem, visited, nums);
            visited[i] = false;
            resItem.remove(resItem.size() - 1);
        }
    }
}
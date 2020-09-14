import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sum = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            if(i>0 && nums[i] == nums[i-1])continue;
            int j=i+1,k = nums.length-1;
            while( j < k){
                if(j>i+1 && nums[j] == nums[j-1]){
                    j++;
                }
                if(nums[i] + nums[j] + nums[k]<0){
                    j++;
                    continue;
                }
                if(nums[i] + nums[j] + nums[k]>0){
                    k--;
                    continue;
                }
                if(nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> res = new ArrayList<>(3);
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(nums[k]);
                    sum.add(res);
                    j++;k--;
                }
            }
        }

        return sum;
    }
    // public List<List<Integer>> threeSum(int[] nums) {
    //     List<List<Integer>> sum = new ArrayList<List<Integer>>();
    //     Arrays.sort(nums);
    //     for(int i=0;i < nums.length-2; i++){
    //         if (i > 0 && nums[i] == nums[i - 1]) {
    //             continue;
    //         }
    //         for(int j= i+1,k=nums.length-1; j < nums.length-1;j++){
    //             if(j>i+1 && nums[j]== nums[j-1]){
    //                 continue;
    //             }
                
    //             while(j < k && nums[j] + nums[k] > 0-nums[i]){
    //                 k--;
    //             }
    //             if (j == k) {
    //                 break;
    //             }
                
    //             if(nums[j] + nums[k] == 0-nums[i]){
    //                 List<Integer> list = new ArrayList<Integer>();
    //                 list.add(nums[i]);
    //                 list.add(nums[j]);
    //                 list.add(nums[k]);
    //                 sum.add(list);
    //                 j++;
    //                 k--;
    //             }
    //         }
    //     }
    //     return sum;
    // }
}
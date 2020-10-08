import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findRepeatNumber(int[] nums) {
        int temp;
        for(int i=0;i<nums.length;i++){
            while (nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
        return -1;
    }

    // public int findRepeatNumber(int[] nums) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for (int num : nums) {
    //         if(map.containsKey(num))return num;
    //         map.put(num, 1);
    //     }
    //     return -1;
    // }

    // public int findRepeatNumber(int[] nums) {
    //     if(nums == null || nums.length == 1)return -1;
    //     Arrays.sort(nums);
    //     for (int i = 1; i < nums.length; i++) {
    //         if(nums[i] == nums[i-1])return nums[i];
    //     }
    //     return -1;
    // }
}
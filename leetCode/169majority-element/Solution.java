import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {

        int cand_num = nums[0], count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (cand_num == nums[i])
                ++count;
            else if (--count == 0) {
                cand_num = nums[i];
                count = 1;
            }
        }
        return cand_num;

        //排序法：
        // Arrays.sort(nums);
        // return nums[nums.length/2 -1];

        //哈希表法
        // Map.Entry<Integer, Integer> majorityEle = null;
        // HashMap<Integer, Integer> maps = new HashMap<>();
        // for (int num : nums) {
        //     if(maps.containsKey(num)){
        //         maps.put(num, maps.get(num) + 1);
        //     }else{
        //         maps.put(num, 1);
        //     }
        // }

        // for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
        //     if(majorityEle == null || entry.getValue() > majorityEle.getValue()) majorityEle = entry;
        // }
        // return majorityEle.getKey();



        // for (int num : nums) {
        //     if(maps.containsKey(num)){
        //         if(maps.get(num) > nums.length/2){
        //             lot = num;
        //             break;
        //         }
        //         else{
        //             maps.put(num, maps.get(num) + 1);
        //         }
        //     }else{
        //         maps.put(num, 1);
        //     }
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     if(maps.containsKey(nums[i])){
        //         int times = maps.get(nums[i]);
        //         if( times > nums.length/2){
        //             lot = nums[i];
        //             break;
        //         }
        //         else{
        //             maps.put(nums[i], times + 1);
        //         }
        //     }else{
        //         maps.put(nums[i], 1);
        //     }
        // }
        //return lot;
    }
}
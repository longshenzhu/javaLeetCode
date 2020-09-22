import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length == 0)return res;

        int ele1 = nums[0], ele2 = nums[0];
        int ele1Count = 0, ele2Count = 0;
        //摩尓抵消，找到可能的众数
        for (int num : nums) {
           if(ele1 == num){
               ele1Count++;
               continue;
           }
           if(ele2 == num){
               ele2Count++;
               continue;
           }
           if(ele1Count == 0){
               ele1 = num;
               ele1Count = 1;
               continue;
           }
           if(ele2Count == 0){
               ele2 = num;
               ele2Count = 1;
               continue;
           }
           ele1Count--;
           ele2Count--;
        }

        //计数，选择众数
        ele1Count = 0;
        ele2Count = 0;
        for (int num : nums) {
            if(ele1 == num)ele1Count++;
            else if(ele2 == num)ele2Count++;
        }
        if(ele1Count > nums.length/3)res.add(ele1);
        if(ele2Count > nums.length/3)res.add(ele2);
        return res;


        // List<Integer> res = new ArrayList<>();
        // if(nums.length == 1){
        //     res.add(nums[0]);
        //     return res;
        // }
        // HashMap<Integer,Integer> maps = new HashMap<>();
        // maps.put(nums[0], 1);
        // for (int i = 1; i < nums.length; i++) {
        //     if(maps.containsKey(nums[i])){
        //         maps.put(nums[i], maps.get(nums[i]) + 1);
        //     }else if(maps.size() == 2){
        //         // 使用entryset()时，foreach和iterator中使用remove会有异常
        //         maps.entrySet().forEach(item->{
        //             if(item.getValue() == 1){
        //                 maps.remove(item.getKey());
        //             }else{
        //                 maps.put(item.getKey(), item.getValue()-1);
        //             }
        //         });
        //     }else if(maps.size() < 2){
        //         maps.put(nums[i], 1);
        //     }
        // }

        // for (int num : nums) {
        //     if(maps.containsKey(num)){
        //         maps.put(num, maps.get(num) + 1);
        //     }
        // }

        // maps.keySet().forEach(key->{
        //     if(maps.get(key)> nums.length/3){
        //         res.add(key);
        //     }
        // });
        // return res;
    }
}
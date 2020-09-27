import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    //递归版本地址：https://leetcode-cn.com/problems/4sum/solution/kshu-zhi-he-de-tong-yong-mo-ban-by-mrxiong/
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length < 4)return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -3; i++) {
            int target3 = target-nums[i];                   //a+b+c = target -d;
            if(i>0&&nums[i]==nums[i-1]) continue;           //去重
            for (int j = i+1; j < nums.length -2; j++) {
                int target2 = target3 - nums[j];            //a+b = target -d - c;
                if(j>i+1 &&nums[j]==nums[j-1]) continue;           //去重
                int left = j+1, right= nums.length -1;
                while(left< right){
                    if(nums[left] + nums[right] > target2){
                        right --;
                        continue;
                    }else if(nums[left] + nums[right] < target2){
                        left ++;
                        continue;
                    }else{
                        List<Integer> newList = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[left], nums[right]));
                        res.add(newList);
                        while(left<right && nums[left+1]==nums[left])      //确保nums[c] 改变了
        				    left++;
        				while(left<right&&nums[right-1]==nums[right])      //确保nums[d] 改变了
        				    right--;
                        left++;
                        right--;
                    }
                    
                }
            }
        }
        return res;
    }


    // public List<List<Integer>> fourSum(int[] nums,int target){
    //     /*定义一个返回值*/
    //     List<List<Integer>> result=new ArrayList<>();
    //     /*当数组为null或元素小于4个时，直接返回*/
    //     if(nums==null||nums.length<4){
    //         return result;
    //     }
    //     /*对数组进行从小到大排序*/
    //     Arrays.sort(nums);
    //     /*数组长度*/
    //     int length=nums.length;
    //     /*定义4个指针k，i，j，h  k从0开始遍历，i从k+1开始遍历，留下j和h，j指向i+1，h指向数组最大值*/
    //     for(int k=0;k<length-3;k++){
    //         /*当k的值与前面的值相等时忽略*/
    //         if(k>0&&nums[k]==nums[k-1]){
    //             continue;
    //         }
    //         /*获取当前最小值，如果最小值比目标值大，说明后面越来越大的值根本没戏*/
    //         int min1=nums[k]+nums[k+1]+nums[k+2]+nums[k+3];
    //         if(min1>target){
    //             break;
    //         }
    //         /*获取当前最大值，如果最大值比目标值小，说明后面越来越小的值根本没戏，忽略*/
    //         int max1=nums[k]+nums[length-1]+nums[length-2]+nums[length-3];
    //         if(max1<target){
    //             continue;
    //         }
    //         /*第二层循环i，初始值指向k+1*/
    //         for(int i=k+1;i<length-2;i++){
    //             /*当i的值与前面的值相等时忽略*/
    //             if(i>k+1&&nums[i]==nums[i-1]){
    //                 continue;
    //             }
    //             /*定义指针j指向i+1*/
    //             int j=i+1;
    //             /*定义指针h指向数组末尾*/
    //             int h=length-1;
    //             /*获取当前最小值，如果最小值比目标值大，说明后面越来越大的值根本没戏*/
    //             int min=nums[k]+nums[i]+nums[j]+nums[j+1];
    //             if(min>target){
    //                 break;
    //             }
    //             /*获取当前最大值，如果最大值比目标值小，说明后面越来越小的值根本没戏，忽略*/
    //             int max=nums[k]+nums[i]+nums[h]+nums[h-1];
    //             if(max<target){
    //                 continue;
    //             }
    //             /*开始j指针和h指针的表演，计算当前和，如果等于目标值，j++并去重，h--并去重，当当前和大于目标值时h--，当当前和小于目标值时j++*/
    //             while (j<h){
    //                 int curr=nums[k]+nums[i]+nums[j]+nums[h];
    //                 if(curr==target){
    //                     result.add(Arrays.asList(nums[k],nums[i],nums[j],nums[h]));
    //                     j++;
    //                     while(j<h&&nums[j]==nums[j-1]){
    //                         j++;
    //                     }
    //                     h--;
    //                     while(j<h&&i<h&&nums[h]==nums[h+1]){
    //                         h--;
    //                     }
    //                 }else if(curr>target){
    //                     h--;
    //                 }else {
    //                    j++;
    //                 }
    //             }
    //         }
    //     }
    //     return result;
    // }
}
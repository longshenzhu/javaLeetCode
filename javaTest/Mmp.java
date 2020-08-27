package javaTest;

import java.util.HashMap;

public class Mmp {
    public static void main(String[] args){
        twoSum1(new int[]{1,2,6,8},8);
        System.out.println("Hello vscode!");
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] indexs = new int[2];
        
        // 建立k-v ，一一对应的哈希表
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target-nums[i],i);
        }
        System.out.println(hash);
        return indexs;
    }
}

//一维数组的坐标变化：i, j
class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0, j =0; i < nums.length; i++) {
            if(nums[i] != 0){
                if(j< i){
                    //交换值，j++
                    nums[j++] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }

        // int j = 0;
        // for(int i = 0 ; i < nums.length; i++)
        // {
        //     if(nums[i] != 0)
        //     {
        //         nums[j++] = nums[i];
        //     }
        // }
        // while(j < nums.length)
        // {
        //     nums[j++] = 0;
        // }

        //最优解
        //双指针，不为0时，交换指针的值
        // for (int p = 0, i = 0; i < nums.length; i++) {
        //     if (nums[i] != 0) {
        //         int temp = nums[i];
        //         nums[i] = nums[p];
        //         nums[p++] = temp;
        //     }
        // }
        //最优解优化
        // int length;
        // if (nums == null || (length = nums.length) == 0) {
        //     return;
        // }
        // int j = 0;
        // for (int i = 0; i < length; i++) {
        //     if (nums[i] != 0) {
        //         if (i > j) {// #1
        //             nums[j] = nums[i];
        //             nums[i] = 0;
        //         }else{
        //             j++;
        //         }
        //     }
        // }
    }
}
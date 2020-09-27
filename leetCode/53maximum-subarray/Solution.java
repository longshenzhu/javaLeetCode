class Solution {
    //[-2,1,-3,4,-1,2,1,-5,4]
    public int maxSubArray(int[] nums) {
        if(nums.length == 0)return 0;
        if(nums.length == 1)return nums[0];

        int preMax = 0;
        int max = nums[0];
        for (int i=1; i < nums.length; i++) {
            preMax = Math.max(preMax+ nums[i], nums[i]);    //包含当前数值的最大序列和：包含三种情况：1.primax < 0时，取nums[i]。 2.primax>0,取primax+nums[i].
            max = Math.max(preMax, max);                    //所有最大值
        }
        return max;
    }
    //动态规划转移方程：f(i)=max{f(i−1)+a[i],a[i]}
}


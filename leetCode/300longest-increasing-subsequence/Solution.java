
class Solution {
    //[10,9,2,5,3,7,101,18]
    public int lengthOfLIS(int[] nums) {
        //dp[i] = max(dp[0]...dp[j]) + 1, 0<=j<i & nums[j] < num[i]
        if(nums == null || nums.length == 0)return 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            int tempMax = 1;
            for (int j = 0; j < i; j++) {
                if(nums[j]< nums[i] && tempMax< dp[j]){
                    tempMax = dp[j];
                }
            }
            // System.out.println(dp[i]);
            dp[i] = tempMax + 1;
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
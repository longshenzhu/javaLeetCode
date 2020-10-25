class Solution {
    //请参考：https://leetcode-cn.com/problems/perfect-squares/solution/wan-quan-ping-fang-shu-by-leetcode/
    public int numSquares(int n) {
        if(n <= 0)return 0;
        int maxSqrt = (int)Math.sqrt(n);
        if(maxSqrt * maxSqrt == n)return 1;
        int[] dp = new int[n+1];
        dp[0] = 0;dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + 1;
            if(Math.pow((int)Math.sqrt(i),2) == i){
                dp[i] = 1;
                continue;
            }
            for (int j = 1; j < Math.sqrt(i); j++) {
                dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
            }
            // System.out.println("dp"+ i + "=" + dp[i]);
        }
        return dp[n];
    }
}
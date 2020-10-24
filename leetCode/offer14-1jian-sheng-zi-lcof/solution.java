class Solution {
    //参考：https://leetcode-cn.com/problems/jian-sheng-zi-lcof/solution/mian-shi-ti-14-i-jian-sheng-zi-tan-xin-si-xiang-by/
    public int cuttingRope(int n) {
        if(n <= 3) return n - 1;
        int a = n / 3, b = n % 3;
        if(b == 0) return (int)Math.pow(3, a);
        if(b == 1) return (int)Math.pow(3, a - 1) * 4;
        return (int)Math.pow(3, a) * 2;
    }
    // public int cuttingRope(int n) {
    //     if(n<3)return 1;
    //     if(n == 3)return 2;
    //     int[] dp = new int[n+1];
    //     dp[1]=1;dp[2]= 1;dp[3]=2;
    //     for (int i = 4; i < n; i++) {
    //         dp[i] = dp[i-1];
    //         for (int j = 2; j < i-1; j++) {
    //             if(j== 2){
    //                 dp[i] = Math.max(dp[i], 2*dp[i-2]);
    //             }
    //             if(j==3){
    //                 dp[i] = Math.max(dp[i], 3*dp[i-3]);
    //             }
    //             dp[i] = Math.max(dp[i], dp[j]*dp[i-j]);  
    //         }
    //     }
    //     return dp[n];
    // }
}
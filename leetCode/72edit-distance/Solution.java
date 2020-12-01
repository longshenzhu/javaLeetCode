class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        // if(m == 0 && n == 0)return 0;
        // if(m == 0 || n == 0)return 1;
        //1.定义dp状态：数组中每个元素的含义
        int[][] dp = new int[m + 1][n + 1];  //dp[i][j]为word1的前i个字符转换成word2的前j个字符的最少操作数
        dp[0][0] = 0;
        for (int i = 1; i < m + 1; i++) {
            dp[i][0] = dp[i-1][0] + 1;
        }
        for (int j = 1; j < n + 1; j++) {
            dp[0][j] = dp[0][j-1] + 1;
        }
        //2.dp方程（状态转移方程）：数组中前后元素的函数关系
        //找出关系dp[i-1][j-1] ——> dp[i][j]
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(Math.min(dp[i][j-1] + 1, dp[i-1][j] + 1), dp[i-1][j-1] + 1);
                }
            }
        }
        return dp[m][n];
        // //3.起始值
        // dp[0][0] = 0;
        // for (int i = 1; i < m; i++) {
        //     dp[i][0] = 1;
        // }
        // for (int j = 1; j < n; j++) {
        //     dp[0][j] = 1;
        // }
    }
}

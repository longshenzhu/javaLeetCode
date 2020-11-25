class Solution {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int row = grid.length;
        int column = grid[0].length;

        //1、定义状态
        int[][] dp = new int[row][column];
        dp[0][0] = grid[0][0];
        //2、dp方程
        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < column; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        //3、起始值
        return dp[row - 1][column - 1];
        // for (int i = 0; i < raw; i++) {
        //     for (int j = 0; j < column; j++) {
        //         if(i == 0 && j == 0){
        //             dp[i][j] = grid[0][0];
        //         }else if(i==0){
        //             dp[i][j] = dp[0][j-1] + grid[0][j];
        //         }else if(j==0){
        //             dp[i][j] = dp[i-1][0] + grid[i][0];
        //         }else{
        //             dp[i][j] = Math.min(dp[i-1][j] + grid[i][j], dp[i][j-1] + grid[i][j]);
        //         }
        //     }
        // }
        // return dp[raw - 1][column - 1];
    }
}
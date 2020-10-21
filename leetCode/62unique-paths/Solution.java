class Solution {
    public int uniquePaths(int m, int n) {
        if(m==0 || n == 0)return 0;
        //第一行、第一列都初始化为1，因为到每一个位置的方式都只有一种
        int[][] mn = new int[m][n];
        for (int i = 0; i < m; i++) {
            mn[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            mn[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                mn[i][j] = mn[i][j-1] + mn[i-1][j];   //dp 方程
            }
        }
        return mn[m-1][n-1];
    }
}
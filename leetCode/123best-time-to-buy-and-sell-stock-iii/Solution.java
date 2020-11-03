class Solution {
    public int maxProfit(int[] prices) {
        //卖出次数：无卖出、卖出一次、卖出两次。k（0、1、2）
        //持有状态：持有、非持有状态 status （0，1）
        //思路：计算出在每天不同状态下的最值 
        //总状态：0卖出、不持有profit[i][0][0]
        //        0卖出、持有  profit[i][0][1]
        //        1卖出、非持有profit[i][1][0]
        //        1卖出、持有  profit[i][1][1]
        //        2卖出、不持有profit[i][2][0]
        int len = prices.length;
        if(prices == null || len < 2)return 0;
        int[][][] profit = new int[len][3][2];

        profit[0][0][0] = 0;
        profit[0][0][1] = -prices[0];
        profit[0][1][0] = 0;
        profit[0][1][1] = -prices[0];
        profit[0][2][0] = 0;
        
        for (int i = 1; i < len; i++) {
            //dp方程
            profit[i][0][0] = profit[i-1][0][0];
            profit[i][0][1] = Math.max(profit[i-1][0][1], profit[i-1][0][0] - prices[i]);
            profit[i][1][0] = Math.max(profit[i-1][1][0], profit[i-1][0][1] + prices[i]);
            profit[i][1][1] = Math.max(profit[i-1][1][1], profit[i-1][1][0] - prices[i]);
            profit[i][2][0] = Math.max(profit[i-1][2][0], profit[i-1][1][1] + prices[i]);
        }
        int first = Math.max(profit[len-1][0][0], profit[len-1][0][1]);
        int second = Math.max(profit[len-1][1][0], profit[len-1][1][1]);
        return Math.max(Math.max(first,second), profit[len-1][2][0]);
    }
 
}
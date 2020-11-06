class Solution {
    //dp
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2)return 0;
        int[] dp = new int[prices.length];
        int max = 0;
        dp[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            // dp[i] = dp[i-1] == 0? Math.max(prices[i] - prices[i-1], dp[i-1]) : dp[i-1]+ prices[i] - prices[i-1];
            dp[i] = Math.max(dp[i-1], dp[i-1]+ prices[i] - prices[i-1]);
            System.out.println(dp[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    // public int maxProfit(int prices[]) {
    //     int minprice = Integer.MAX_VALUE;
    //     int maxprofit = 0;
    //     for (int i = 0; i < prices.length; i++) {
    //         if (prices[i] < minprice) {
    //             minprice = prices[i];
    //         } else if (prices[i] - minprice > maxprofit) {
    //             maxprofit = prices[i] - minprice;
    //         }
    //     }
    //     return maxprofit;
    // }

}
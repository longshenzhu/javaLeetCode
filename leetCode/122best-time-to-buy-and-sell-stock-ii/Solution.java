class Solution {
    public int maxProfit = 0;
    public int maxProfit(int[] prices) {

        int start = 0;
        int curStock = 0;
        int curProfit = 0;
        recursion(prices, start, curProfit, curStock);
        return maxProfit;
    }

    private void recursion(int[] prices, int start, int curProfit, int curStock) {
        if(start == prices.length){
            if(curProfit > maxProfit)maxProfit = curProfit;
            return;
        }
        for (int i = start; i < prices.length; i++) {
            //curProfit > 0 待卖出状态
            if(curStock > 0){
                recursion(prices, i + 1, curProfit + (prices[i] - curStock), 0);
            }
            //curProfit = 0 待买入状态
            else if(curStock == 0){
                recursion(prices, i + 1, curProfit, prices[i]);
            }
        }

        // //curProfit > 0 待卖出状态
        // if(curStock > 0){
        //     for (int i = start; i < prices.length; i++) {
        //         recursion(prices, i + 1, curProfit + (prices[start] - curStock), 0);
        //     }
            
        // }
        // //curProfit = 0 待买入状态
        // else if(curStock == 0){
        //     for (int i = start; i < prices.length; i++) {
        //         recursion(prices, i + 1, curProfit, prices[i]);
        //     }
        // }
        

        
        
    }
 
}
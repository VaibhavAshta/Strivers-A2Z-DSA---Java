class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else{
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1129065711/

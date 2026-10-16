class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0;
        for (int j = 0; j < prices.length; j++) {
            
            int profit = prices[j] - prices[i];
            if (profit < 0) {
                i++;
                i = j;
            } else if (profit > 0) {
                maxProfit = Math.max(maxProfit, profit);
            }
            
        }
        return maxProfit;
    }
}

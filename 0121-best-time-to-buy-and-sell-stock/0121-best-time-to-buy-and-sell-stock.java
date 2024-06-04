class Solution {
    public int maxProfit(int[] prices) {
        
        int length = prices.length;
        int min = Integer.MAX_VALUE;
        int profit = 0;
        

        for (int i = 0; i<length; i++){
            if (prices[i]<min){
                min = prices[i];
            }

            if(prices[i]-min>profit){
                profit = prices[i] - min;
            }
        }

        

        return profit;
    }
}
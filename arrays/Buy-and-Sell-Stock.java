// Problem : Best Time to Buy and Sell Stock
// Platform : Leetcode
// Topic : Arrays, Dynamic Programming
// Difficulty : Easy
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 1; int min = prices[0];
        for(int i=0;i<prices.length;i++){
             int profitoday = prices[i] - min; //profit = SP-CP;
            if(profitoday>profit){
                profit = profitoday;
            }
           if(prices[i]<min){
            min = prices[i];
           } 

        } return profit;
    }
}

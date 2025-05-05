class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int Profit = 0;
        for(int max : prices){
            if(max<min){
                min=max;
            } else if (max - min > Profit){
                Profit = max - min;
            }
        } 
        return Profit;   
    }
}
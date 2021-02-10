package leetcode;

public class MaxPrice {
    public int maxProfit(int[] prices) {
        int max = 0;
        int length = prices.length;
        for(int i = 0; i < length; i++) {
            for(int j = i+1;j < length;j++) {
                if(prices[j]-prices[i]>0) {
                    int temp =  prices[j]-prices[i];
                    if(temp > max){
                        max = temp;
                    }
                }
            }
        }
        return max;
    }
}

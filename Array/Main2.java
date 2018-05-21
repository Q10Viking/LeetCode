//https://leetcode.com/articles/best-time-buy-and-sell-stock-ii/
//Brute Force

class Solution{
    public int maxProfit(int[] prices){
        return calculate(price,0);
    }

    public int calculate(int[] prices,int s){
        if(s>=prices.length)
            return 0;
        int max = 0;
        for(int start = s;start<prices.length;start++){
            int maxprofit = 0;
            for(int i=start+1;i<prices.length;i++)
        }
    }
}

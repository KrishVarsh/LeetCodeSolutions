class Solution {//can be optimized
    public int maxProfit(int[] a) {
        int n=a.length;
        int mini=a[0],profit=0;
        for(int i=1;i<n;i++){
            int cost=a[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,a[i]);
        }
        return profit;}}
        

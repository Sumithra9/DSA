class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int mini=prices[0];
        int maxi=0;
        for(int i=0;i<n;i++){
            int profit=prices[i]-mini;
            maxi=Math.max(maxi,profit);
            mini=Math.min(mini,prices[i]);
        }
        return maxi;
    }
}
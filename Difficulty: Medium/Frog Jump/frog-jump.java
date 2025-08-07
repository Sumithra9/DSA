// User function Template for Java
class Solution {
    int minCost(int[] height) {
        int n=height.length;
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<n;i++){
            int one=dp[i-1]+Math.abs(height[i-1]-height[i]);
            int two=Integer.MAX_VALUE;
            if(i>1){
                two=dp[i-2]+Math.abs(height[i-2]-height[i]);
            }
            dp[i]=Math.min(one,two);
        }
        return dp[n-1];
    }
}
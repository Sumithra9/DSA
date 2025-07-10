// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int sum=0;
        int maxsum=0;
        for(int i=0;i<k;i++) sum+=arr[i];
        maxsum=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}
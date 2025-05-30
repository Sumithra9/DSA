class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<n;i++){
            currentsum+=nums[i];
            maxsum=Math.max(maxsum,currentsum);
            if(currentsum<0){
                currentsum=0;
            }
        }
        return maxsum;
    }
}
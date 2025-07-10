class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++) sum+=nums[i];
        int left=0;
        double maxsum=sum;
        for(int right=k;right<nums.length;right++){
            sum=sum-nums[left]+nums[right];
            left++;
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum/k;
    }
}
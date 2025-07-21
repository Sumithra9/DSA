class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int runningsum=0;
        for(int num:nums) runningsum+=num;
        return sum-runningsum;
    }
}
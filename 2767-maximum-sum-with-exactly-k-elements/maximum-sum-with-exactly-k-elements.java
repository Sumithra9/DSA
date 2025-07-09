class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[n-1];
            nums[n-1]+=1;
        }
        return sum;
    }
}
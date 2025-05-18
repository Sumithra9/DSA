class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones=0;
        int maxi=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                ones++;
            }
            else if(nums[i]==0){
                maxi=Math.max(ones,maxi);
                ones=0;
            }
        }
        return Math.max(maxi,ones);
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] soln=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(target==nums[i]+nums[j]){
                    soln[0]=i;
                    soln[1]=j;
                }
            }
        }
        return soln;
    }
}
class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex=-1;
        int maxIndex=-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
        }
        int maxi=Math.max(minIndex,maxIndex);
        int mini=Math.min(minIndex,maxIndex);
        int frontops=maxi+1;
        int backops=n-mini;
        int bothops=(mini+1)+(n-maxi);
        return Math.min(bothops,Math.min(frontops,backops));
    }
}
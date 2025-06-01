class Solution {
    public int lowerbound(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans == -1 ? n : ans;
    }
    public int upperbound(int[] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans == -1 ? n : ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb=lowerbound(nums,target);
        int ub=upperbound(nums,target);
        int[] result=new int[2];        
        if(lb == nums.length || nums[lb] != target){
            result[0]=-1;
            result[1]=-1;
        }
        else{
            result[0]=lb;
            result[1]=ub-1;
        }
        return result;
    }
}
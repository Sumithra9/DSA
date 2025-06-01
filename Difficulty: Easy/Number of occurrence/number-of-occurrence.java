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
    int countFreq(int[] arr, int target) {
        int lb=lowerbound(arr,target);
        int ub=upperbound(arr,target);
        return ub-lb;
    }
}

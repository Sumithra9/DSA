class Solution {

    static int findFloor(int[] arr, int x) {
        int n=arr.length;
        int index=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                index=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return index;
    }
}

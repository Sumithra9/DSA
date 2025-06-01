// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int[] result=new int[2];
        result[0]=-1;
        result[1]=-1;
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]<=x){
                result[0]=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        mid=0;
        low=0;
        high=arr.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>=x){
                result[1]=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
       return result; 
    }
}

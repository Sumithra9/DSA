// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        int[] temp=new int[arr.length];
        return mergeSort(arr,temp,0,arr.length-1);
    }
    
    static int mergeSort(int[] arr,int[] temp,int left,int right){
        int count=0;
        if(left<right){
            int mid=(left+right)/2;
            count+=mergeSort(arr,temp,left,mid);
            count+=mergeSort(arr,temp,mid+1,right);
            count+=merge(arr,temp,left,mid,right);
        }
        return count;
    }
    
    static int merge(int[] arr,int[] temp,int left,int mid, int right){
        int count=0;
        int i=left;
        int j=mid +1;
        int k=left;
        
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
                count+=(mid-i+1);
            }
        }
        
        while(i<=mid) temp[k++]=arr[i++];
        while(j<=right) temp[k++]=arr[j++];
        
        for(i=left;i<=right;i++){
            arr[i]=temp[i];
        }
        
        return count;
        
    }
}
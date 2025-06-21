// // User function Template for Java

class Solution {
    public void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] arr) {
        reverse(arr,0,arr.length-1);
        reverse(arr,1,arr.length-1);
        
    }
}
// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int ans=arr[n-1]-arr[0];
        int small=arr[0]+k;
        int big=arr[n-1]-k;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0) continue;
            int min=Math.min(small,arr[i]-k);
            int max=Math.max(big,arr[i-1]+k);
            ans=Math.min(ans,max-min);
        }
        return ans;
    }
}

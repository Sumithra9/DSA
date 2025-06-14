// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int a=0;
        int d=0;
        int n=arr.length;
        int count=0;
        int result=0;
        while(a<n && d<n){
            if(arr[a]<=dep[d]){
                count++;
                a++;
            }
            else if(arr[a]>dep[d]){
                count--;
                d++;
            }
            result=Math.max(result,count);
        }
        return result;
    }
}

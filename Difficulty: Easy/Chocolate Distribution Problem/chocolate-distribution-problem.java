// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int ini_min=arr.get(0);
        int ini_max=arr.get(m-1);
        int ans=ini_max-ini_min;
        int left=0;
        for(int right=m;right<arr.size();right++){
            left++;
            ans=Math.min(ans,arr.get(right)-arr.get(left));
        }
        return ans;
    }
}
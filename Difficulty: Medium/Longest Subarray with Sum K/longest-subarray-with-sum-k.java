// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k) maxlen=i+1;
            if(map.containsKey(sum-k)){
                int prev=map.get(sum-k);
                maxlen=Math.max(maxlen,i-prev);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxlen;
    }
}

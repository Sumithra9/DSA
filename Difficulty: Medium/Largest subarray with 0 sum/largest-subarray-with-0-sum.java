class Solution {
    int maxLength(int arr[]) {
        // code here
        int maxlen=0;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0) maxlen=i+1;
            if(map.containsKey(sum)){
                int prev=map.get(sum);
                maxlen=Math.max(maxlen,i-prev);
            }
            else map.put(sum,i);
        }
        return maxlen;
    }
}
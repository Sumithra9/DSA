class Solution {
    public int totalElements(int[] arr) {
        // code here
        int n=arr.length;
        int left=0;
        int maxlen=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int right=0;right<n;right++){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while(map.size()>2){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0) map.remove(arr[left]);
                left++;
                
            }
            maxlen=Math.max(maxlen,right-left+1);
            
        }
        return maxlen;
    }
}
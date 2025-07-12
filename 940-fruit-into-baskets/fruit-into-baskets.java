class Solution {
    public int totalFruit(int[] fruits) {
        int count=0;
        int n=fruits.length;
        int start=0;
        int end=0;
        int maxlen=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(end<n){
            int a=fruits[end];
            map.put(a,map.getOrDefault(a,0)+1);
            if(map.get(a)==1) count++;
            while(count>2){
                int temp=fruits[start];
                map.put(temp,map.get(temp)-1);
                if(map.get(temp)==0) count--;
                start++;
            }
            maxlen=Math.max(maxlen,end-start+1);
            end++;
        }
        return maxlen;
    }
}
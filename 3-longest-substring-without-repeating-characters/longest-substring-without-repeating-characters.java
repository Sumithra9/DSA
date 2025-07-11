class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int left=0;
        int right=0;
        int n=s.length();
        int maxlen=0;
        while(right<n){
            char c=s.charAt(right);
            if(map.containsKey(c)) left=Math.max(left,map.get(c)+1);
            map.put(c,right);
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        } 
        return maxlen;       
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            String res="";
            Set<Character>set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                char a=s.charAt(j);
                if(set.contains(a)) break;
                else{
                    set.add(a);
                    res+=a;
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }
}
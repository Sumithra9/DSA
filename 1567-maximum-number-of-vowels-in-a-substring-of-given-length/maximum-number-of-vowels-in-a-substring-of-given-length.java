class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int count=0;
        Set<Character>set=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))) count++;
        }
        int maxcount=count;
        for(int right=k;right<s.length();right++){
            if(set.contains(s.charAt(left))) count--;
            left++;
            if(set.contains(s.charAt(right))) count++;
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
}
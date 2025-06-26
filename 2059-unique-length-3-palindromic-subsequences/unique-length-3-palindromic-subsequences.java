class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<String>set=new HashSet<>();
        for(char c='a';c<='z';c++){
            int first=s.indexOf(c);
            int last=s.lastIndexOf(c);
            if(first!=-1 && last-first>=2){
                Set<Character>middle=new HashSet<>();
                for(int i=first+1;i<last;i++){
                    middle.add(s.charAt(i));
                }
                for(char mid:middle){
                    set.add(""+c+mid+c);
                }
            }
        }
        return set.size();
    }
}
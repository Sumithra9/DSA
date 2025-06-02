class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] S=new char[s.length()];
        char[] T=new char[t.length()];
        for(int i=0;i<s.length();i++){
            S[i]=s.charAt(i);
            T[i]=t.charAt(i);
        }
        Arrays.sort(S);
        Arrays.sort(T);
        for(int i=0;i<S.length;i++){
            if(S[i]!=T[i]) return false;
        }
        return true;
    }
}
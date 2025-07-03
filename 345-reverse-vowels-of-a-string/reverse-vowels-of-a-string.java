class Solution {
    public String reverseVowels(String s) {
        Set<Character>vowel=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int n=s.length();
        int start=0;
        int end=n-1;
        char[] str=s.toCharArray();
        while(start<end){
            if(!vowel.contains(str[start])) start++;
            if(!vowel.contains(str[end])) end--;
            if(vowel.contains(str[start]) && vowel.contains(str[end])){
                char t=str[start];
                str[start]=str[end];
                str[end]=t;
                start++;
                end--;
            }
        }
        return new String(str);
    }
}
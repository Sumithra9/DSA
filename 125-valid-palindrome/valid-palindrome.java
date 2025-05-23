class Solution {
    public boolean isPalindrome(String s) {
        boolean palindrome=true;
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]", "");
        int n=s.length();
        int start=0;
        int end=n-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
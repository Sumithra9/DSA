class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int right=n-1;
        while(right>=0 && s.charAt(right)==' '){
            right--;
        }
        int left=right;
        while(left>=0 && s.charAt(left)!=' '){
            left--;
        }
        return right-left;
    }
}
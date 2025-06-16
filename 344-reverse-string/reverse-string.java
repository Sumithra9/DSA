class Solution {
    public void recur(char[]s,int l,int r){
        if(l>=r) return;
        char temp=s[l];
        s[l]=s[r];
        s[r]=temp;
        recur(s,l+1,r-1);
    }
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        recur(s,l,r);
    }
}
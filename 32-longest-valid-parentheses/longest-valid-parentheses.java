class Solution {
    public int longestValidParentheses(String s) {
        int length=s.length();
        int[] j=new int[length+1];
        int maxlength=0;
        for(int i=2;i<=length;++i){
            if(s.charAt(i-1)==')'){
                if(s.charAt(i-2)=='('){
                    j[i]=j[i-2]+2;
                }
                else{
                    int prev=i-j[i-1]-1;
                    if(prev>0 && s.charAt(prev-1)=='('){
                        j[i]=j[i-1]+2+j[prev-1];
                    }
                }
            }
            maxlength=Math.max(maxlength,j[i]);
        }
        return maxlength;
    }
}
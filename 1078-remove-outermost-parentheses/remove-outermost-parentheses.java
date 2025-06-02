class Solution {
    public String removeOuterParentheses(String s) {
        int depth=0;
        int n=s.length();
        String result="";
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                if (depth>0) result+=c;
                depth++;
            }
            else if(c==')'){
                depth--;
                if(depth>0) result+=c;
            }
        }
        return result;
    }
}
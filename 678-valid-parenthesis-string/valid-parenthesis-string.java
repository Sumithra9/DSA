class Solution {
    public boolean checkValidString(String s) {
        int mini=0;
        int maxi=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                mini++;
                maxi++;
            }
            else if(c==')'){
                mini=Math.max(mini-1,0);
                maxi--;
            }
            else{
                mini=Math.max(mini-1,0);
                maxi++;
            }
            if(maxi<0) return false;
        }
        return (mini==0|| maxi==0);
    }
}
class Solution {
    public void helper(int n, int open,int close, String current,List<String> result){
        if(current.length()==2*n){
            result.add(current);
            return;
        }
        if(open<n){
            helper(n,open+1,close,current+"(",result);
        }
        if(close<open){
            helper(n,open,close+1,current+")",result);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        helper(n,0,0,"",result);
        return result;
    }
}
class Solution {
    public void helper(int k,int n,int ind,List<Integer>ans,List<List<Integer>> result){
        if(k==0 && n==0){
            result.add(new ArrayList<>(ans));
            return;
        }
        if (k == 0 || n < 0) return;
        for(int i=ind;i<=9;i++){
            ans.add(i);
            helper(k-1,n-i,i+1,ans,result);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        helper(k,n,1,ans,result);
        return result;
    }
}
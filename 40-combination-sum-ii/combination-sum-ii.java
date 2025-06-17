class Solution {
    public void helperfunction(int[] nums,int target,int ind,List<Integer> ans,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]) continue;
            if(nums[i]>target) break;
            ans.add(nums[i]);
            helperfunction(nums,target-nums[i],i+1,ans,result);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(candidates);
        helperfunction(candidates,target,0,ans,result);
        return result;
    }
}
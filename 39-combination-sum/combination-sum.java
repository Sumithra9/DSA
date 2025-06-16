class Solution {
    public void helperfunction(int[] nums,int target,int i,int sum, List<Integer> ans,List<List<Integer>> result){
        if(sum>target) return;
        if(i==nums.length){
            if(sum==target){
                result.add(new ArrayList<>(ans));
            }
            return;
        }
        sum+=nums[i];
        ans.add(nums[i]);
        helperfunction(nums,target,i,sum,ans,result);
        sum-=nums[i];
        ans.remove(ans.size()-1);
        helperfunction(nums,target,i+1,sum,ans,result);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        helperfunction(candidates,target,0,0,ans,result);
        return result;

    }
}
class Solution {
    public void helper(int[] nums, int ind,List<Integer> ans,List<List<Integer>> result){
        result.add(new ArrayList<>(ans));
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]) continue;
            ans.add(nums[i]);
            helper(nums,i+1,ans,result);
            ans.remove(ans.size()-1);
        }
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,ans,result);
        return result;
    }
}
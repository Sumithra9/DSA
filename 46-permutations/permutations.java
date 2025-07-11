class Solution {
    public void backtrack(List<List<Integer>>result,List<Integer>list,int[]nums){
        if(list.size()==nums.length) result.add(new ArrayList<>(list));
        else{
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            backtrack(result,list,nums);
            list.remove(list.size()-1);
        }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums);
        return result;
    }
}
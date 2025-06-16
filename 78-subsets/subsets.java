class Solution {
    List<List<Integer>>result=new ArrayList<>();
    public void recursion(int[] nums, int i, List<Integer> current){
        if(i>=nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        recursion(nums,i+1,current);
        current.remove(current.size()-1);
        recursion(nums,i+1,current);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>current=new ArrayList<>();
        recursion(nums,0,current);
        return result;
    }
}
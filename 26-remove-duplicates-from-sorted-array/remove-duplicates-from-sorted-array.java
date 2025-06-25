class Solution {
    public int removeDuplicates(int[] nums) {
        int current=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]) continue;
            else{
                nums[current]=nums[i];
                current++;
            }
        }
        return current;
    }
}
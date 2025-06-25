class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] ans=new int[2];
        map.put(target-nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                ans[0]=map.get(nums[i]);
                ans[1]=i;
            }
            map.put(target-nums[i],i);
        }
        return ans;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] ans=new int[2];
        map.put(0,target-nums[0]);
        for(int i=1;i<nums.length;i++){
            if(map.containsValue(nums[i])){
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue().equals(nums[i])) {
                    ans[0] = entry.getKey();
                    break; 
                    }
                }
                ans[1]=i;
                break;
            }
            map.put(i,target-nums[i]);
        }
       return ans; 
        
    }
}
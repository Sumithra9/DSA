class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Integer key:map.keySet()){
            int c=map.get(key);
            if(c>n/3){
                result.add(key);
            }
        }
        return result;
    }
}
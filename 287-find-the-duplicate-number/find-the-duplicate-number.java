class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int n=0;
        for(Integer key:map.keySet()){
            if(map.get(key)>1){
                n=key;
                break;
            }
        }
        return n;
    }
}
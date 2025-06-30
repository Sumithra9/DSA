class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int i=0;
        int count=0;
        for(Integer key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        for(Integer key:map.keySet()){
            if(map.get(key)==1){
                nums[i]=key;
                i++;
                count++;
            }
            else if(map.get(key)>1){
                nums[i]=key;
                i++;
                nums[i]=key;
                i++;
                count+=2;
            }
        }
        return count;
    }
}
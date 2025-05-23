class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int longest=0;
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int current=num;
                int count=1;
                while(set.contains(current+1)){
                    current+=1;
                    count+=1;
                }
                longest=Math.max(longest,count);
            }
            
        }
        return longest;
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        HashMap<Integer,Integer>map=new HashMap<>();
        for(Integer num:set1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Integer num:set2){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(Integer key:map.keySet()){
            if(map.get(key)==2) list.add(key);
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++) ans[i]=list.get(i);
        return ans;
        
    }
}
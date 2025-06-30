class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums1) set.add(num);
        for(int num:nums2){
            if(!set.contains(num) && !ans1.contains(num)) ans1.add(num);
        }
        set.clear();
        for(int num:nums2) set.add(num);
        for(int num:nums1){
            if(!set.contains(num) && !ans2.contains(num)) ans2.add(num);
        }
        answer.add(ans2);
        answer.add(ans1);
        return answer;
    }
}
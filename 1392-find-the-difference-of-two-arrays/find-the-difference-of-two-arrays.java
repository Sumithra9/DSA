class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer=new ArrayList<>();
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int num:nums1) set1.add(num);
        for(int num:nums2) set2.add(num);
        HashSet<Integer>only1=new HashSet<>(set1);
        only1.removeAll(set2);
        HashSet<Integer>only2=new HashSet<>(set2);
        only2.removeAll(set1);
        answer.add(new ArrayList<>(only1));
        answer.add(new ArrayList<>(only2));
        return answer;
    }
}
// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        int a1=arr1.size();
        List<Integer>result=new ArrayList<>();
        Set<Integer>set2=new HashSet<>();
        Set<Integer>set3=new HashSet<>();
        Set<Integer>seen=new HashSet<>();
        for(Integer num:arr2) set2.add(num);
        for(Integer num:arr3) set3.add(num);
        for(Integer num: arr1){
            if(set2.contains(num) && set3.contains(num) && !seen.contains(num)){
                result.add(num);
                seen.add(num);
            }
        }
        return result;
    }
}
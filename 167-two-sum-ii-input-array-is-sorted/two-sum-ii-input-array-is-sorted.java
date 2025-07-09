class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int comp=target-numbers[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i+1};
            }
            map.put(numbers[i],i+1);
        }
        return new int[2];
    }
}
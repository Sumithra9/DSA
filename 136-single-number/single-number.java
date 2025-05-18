class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            set.add(nums[i]);
        }
        ArrayList<Integer>arr=new ArrayList<>(set);
        int s=arr.size();
        int setsum=0;
        for(int i=0;i<s;i++){
            setsum+=arr.get(i);
        }
        return (setsum*2)-sum;
    }
}
class Solution {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        List<Integer> numsList=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            numsList.add(nums[i]);
        }
        int gcdval=numsDivide[0];
        for(int i=1;i<numsDivide.length;i++){
            gcdval=gcd(gcdval,numsDivide[i]);
        }
        Collections.sort(numsList);
        for(int i=0;i<numsList.size();i++){
            if(gcdval%numsList.get(i)==0){
                return i;
            }
        }
        return -1;
    }
}
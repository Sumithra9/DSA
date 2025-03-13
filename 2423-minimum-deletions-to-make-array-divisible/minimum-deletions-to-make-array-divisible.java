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
        int gcdval=numsDivide[0];
        for(int i=1;i<numsDivide.length;i++){
            gcdval=gcd(gcdval,numsDivide[i]);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(gcdval%nums[i]==0){
                return i;
            }
        }
        return -1;
    }
}
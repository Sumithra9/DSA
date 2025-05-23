// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        List<Integer>nums=new ArrayList<>();
        int x=n;
        while(x!=0){
            int a=x%10;
            nums.add(a);
            x=x/10;
        }
        int sum=0;
        for(int num:nums){
            sum+=Math.pow(num,3);
        }
        if(sum==n) return true;
        else return false;
    }
}
// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        List<Integer> set=new ArrayList<>();
        int x=n;
        while(x!=0){
            int a=x%10;
            set.add(a);
            x=x/10;
        }
        int count=0;
        for(Integer num:set){
            if(num==0) continue;
            else if(n%num==0) count++;
        }
        return count;
    }
}
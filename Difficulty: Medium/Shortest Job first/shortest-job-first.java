// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int wait=0;
        int total=0;
        for(int i=0;i<bt.length;i++){
            wait+=total;
            total+=bt[i];
        }
        return wait/bt.length;
    }
}

// User function Template for Java
class Solution {
    static int setKthBit(int n, int k) {
        // code here
        int a=1<<k;
        return n|a;
    }
}
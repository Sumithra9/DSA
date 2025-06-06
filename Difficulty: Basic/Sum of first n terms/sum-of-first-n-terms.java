// User function Template for Java

class Solution {
    int sumOfSeries(int n) {
        if(n==1) return 1;
        return (n*n*n)+sumOfSeries(n-1);
    }
}
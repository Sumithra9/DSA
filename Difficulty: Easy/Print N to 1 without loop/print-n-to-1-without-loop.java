class Solution {
    void printNos(int N) {
        if(N<1) return;
        System.out.print(N+" ");
        printNos(N-1);
        
    }
}
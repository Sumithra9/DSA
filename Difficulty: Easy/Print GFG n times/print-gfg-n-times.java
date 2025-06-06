class Solution {
    void printn(int i,int n){
        if(i>n){
            return;
        }
        System.out.print("GFG ");
        printn(i+1,n);
    }
    void printGfg(int N) {
        // code here
        printn(1,N);
    }
}
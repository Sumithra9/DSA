class Solution {
    public void printnum(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        printnum(i+1,n);
    }
    public void printNos(int n) {
        // Code here
        printnum(1,n);
    }
}

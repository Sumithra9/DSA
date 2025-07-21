class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int num:arr){
            max=Math.max(max,num);
        }
        int secondmax=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>secondmax && num<max){
                secondmax=num;
            }
        }
        return (secondmax==Integer.MIN_VALUE)?-1:secondmax;
    }
}
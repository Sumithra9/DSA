class Solution {
    public void rotate(int[][] matrix) {
        //Step 1 : Transpose Finding (turn rows to cols and vice versa)
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }
    }
    public void reverse(int[] arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
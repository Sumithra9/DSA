class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList <Integer> rows=new ArrayList<>();
        ArrayList <Integer> cols=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(Integer row:rows){
            for(int i=0;i<m;i++){
                matrix[row][i]=0;
            }
        }
        for(Integer col:cols){
            for(int i=0;i<n;i++){
                matrix[i][col]=0;
            }
        }
    }
}
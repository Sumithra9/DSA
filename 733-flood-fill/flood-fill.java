class Solution {
    public void dfs(int[][] ans,int[][] image,int row,int col, int[] delrow,int[] delcol,int inicol,int newcol){
        ans[row][col]=newcol;
        int n=ans.length;
        int m=ans[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==inicol && ans[nrow][ncol]!=newcol){
                dfs(ans,image,nrow,ncol,delrow,delcol,inicol,newcol);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=image[i][j];
            }
        }
        int inicol=image[sr][sc];
        int[] delrow={-1,0,1,0};
        int[] delcol={0,1,0,-1};
        dfs(ans,image,sr,sc,delrow,delcol,inicol,color);
        return ans;
    }
}
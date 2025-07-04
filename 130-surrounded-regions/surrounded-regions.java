class Solution {
    public void dfs(int row,int col,char[][] board,int[][] vis,int[] delrow,int[] delcol){
        vis[row][col]=1;
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && board[nrow][ncol]=='O' && vis[nrow][ncol]==0){
                dfs(nrow,ncol,board,vis,delrow,delcol);
            }
        }
    }
    public void solve(char[][] board) {
        int[] delrow={0,0,1,-1};
        int[] delcol={1,-1,0,0};
        int n=board.length;
        int m=board[0].length;
        int[][] vis=new int[n][m];
        for(int j=0;j<m;j++){
            if(vis[0][j]==0 && board[0][j]=='O') dfs(0,j,board,vis,delrow,delcol);
            if(vis[n-1][j]==0 && board[n-1][j]=='O') dfs(n-1,j,board,vis,delrow,delcol);
        }
        for(int i=0;i<n;i++){
            if(vis[i][0]==0 && board[i][0]=='O') dfs(i,0,board,vis,delrow,delcol);
            if(vis[i][m-1]==0 && board[i][m-1]=='O') dfs(i,m-1,board,vis,delrow,delcol);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && board[i][j]=='O') board[i][j]='X';
            }
        }
    }
}
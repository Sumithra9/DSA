class Solution {
    public class Pair{
        int first;
        int second;
        Pair(int a,int b){
            first=a;
            second=b;
        }
    }
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[] delrow={0,0,1,-1};
        int[] delcol={1,-1,0,0};
        Queue<Pair>queue=new LinkedList<>();
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0||i==n-1||j==m-1){
                    if(grid[i][j]==1){
                        vis[i][j]=1;
                        queue.add(new Pair(i,j));
                    }
                }
            }
        }
        while(!queue.isEmpty()){
            int row=queue.peek().first;
            int col=queue.peek().second;
            queue.remove();
            for(int i=0;i<4;i++){
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    queue.add(new Pair(nrow,ncol));
                    vis[nrow][ncol]=1;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]==1) count++;
            }
        }
        return count;
    }
}
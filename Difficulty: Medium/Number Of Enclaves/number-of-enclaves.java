// User function Template for Java

class Solution {
    class Pair{
        int first;
        int second;
        Pair(int a,int b){
            first=a;
            second=b;
        }
    }
    int numberOfEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair>queue=new LinkedList<>();
        int[][] vis=new int[n][m];
        int[] delrow={0,0,1,-1};
        int[] delcol={1,-1,0,0};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||i==n-1||j==0||j==m-1){
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
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1 && vis[nrow][ncol]==0){
                    queue.add(new Pair(nrow,ncol));
                    vis[nrow][ncol]=1;
                }
            }
        }
        int count=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j]==1 && vis[i][j]==0){
                        count++;
                    }
                }
            }
        return count;
    }
}
class Solution {
    public class Node{
        int first;
        int second;
        int third;
        Node(int f,int s,int t){
            first=f;
            second=s;
            third=t;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        int[][] vis=new int[n][m];
        int[][] dist=new int[n][m];
        Queue<Node>queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    vis[i][j]=1;
                    queue.add(new Node(i,j,0));
                }
                else vis[i][j]=0;
            }
        }
        while(!queue.isEmpty()){
            int row=queue.peek().first;
            int col=queue.peek().second;
            int step=queue.peek().third;
            queue.remove();
            dist[row][col]=step;
            for(int i=0;i<4;i++){
                int nrow=row+dx[i];
                int ncol=col+dy[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    queue.add(new Node(nrow,ncol,step+1));
                }
            }

        }
        return dist;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]>queue=new LinkedList<>();
        int fresh=0;
        int count=0;
        int time=0;
        int n=grid.length;
        int m=grid[0].length;
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2) queue.add(new int[]{i,j});
                if(grid[i][j]!=0) fresh++;
            }
        }
        if(fresh==0) return 0;
        while(!queue.isEmpty()){
            int size=queue.size();
            count+=size;
            for(int i=0;i<size;i++){
                int[] point=queue.remove();
                for(int j=0;j<4;j++){
                    int x=point[0]+dx[j];
                    int y=point[1]+dy[j];
                    if(x<0 || x>=n || y<0 || y>=m || grid[x][y]==0 || grid[x][y]==2) continue;
                    grid[x][y]=2;
                    queue.add(new int[]{x,y});
                }
            }
            if(queue.size()!=0) time++;
        }
        if(fresh==count) return time;
        else return -1;
    }
}
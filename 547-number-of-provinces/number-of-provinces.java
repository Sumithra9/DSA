class Solution {
    public void dfs(int node,int[][]matrix,boolean[] visited){
        visited[node]=true;
        for(int i=0;i<matrix.length;i++){
            if(matrix[node][i]==1 && visited[i]==false){
                dfs(i,matrix,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]==false){
                count++;
                dfs(i,isConnected,visited);
            }
        }
        return count;
    }
}
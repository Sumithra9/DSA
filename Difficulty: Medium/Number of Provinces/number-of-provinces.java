// User function Template for Java

class Solution {
    static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited,int V){
        visited[node]=true;
        for(int i=0;i<V;i++){
            if(adj.get(node).get(i) == 1 && !visited[i]) dfs(i,adj,visited,V);
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited=new boolean[V];
        int count=0;
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                count++;
                dfs(i,adj,visited,V);
            }
        }
        return count;
    }
};
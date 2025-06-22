class Solution {
    public void dfshelper(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ls){
        ls.add(node);
        vis[node]=true;
        for(Integer it:adj.get(node)){
            if(!vis[it]){
                dfshelper(it,vis,adj,ls);
            }
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>ls=new ArrayList<>();
        boolean vis[]=new boolean[adj.size()];
        dfshelper(0,vis,adj,ls);
        return ls;
        
    }
}
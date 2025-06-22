class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int V=adj.size();
        ArrayList<Integer>result=new ArrayList<>();
        boolean[] visited=new boolean[V];
        Queue<Integer>queue=new LinkedList<>();
        queue.add(0);
        visited[0]=true;
        while(!queue.isEmpty()){
            int node=queue.poll();
            result.add(node);
            for(Integer it:adj.get(node)){
                if(visited[it]==false){
                    visited[it]=true;
                    queue.add(it);
                }
            }
        }
        return result;
    }
}
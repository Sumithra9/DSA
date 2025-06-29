class Solution {
    public class Node {
        int first;
        int second;
        Node(int f, int s) {
            first = f;
            second = s;
        }
    }

    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Build adjacency list
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        boolean[] vis = new boolean[V];

        // Handle disconnected graph by checking all components
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (bfsCycle(i, vis, adj)) return true;
            }
        }
        return false;
    }

    private boolean bfsCycle(int start, boolean[] vis, List<List<Integer>> adj) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(start, -1));
        vis[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.peek().first;
            int parent = queue.peek().second;
            queue.remove();

            for (Integer neighbor : adj.get(node)) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    queue.add(new Node(neighbor, node));
                } else if (neighbor != parent) {
                    return true;
                }
            }
        }

        return false;
    }
}

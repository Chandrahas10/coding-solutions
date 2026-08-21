import java.util.*;

class Solution {

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[adj.size()];

        ArrayList<Integer> result = new ArrayList<>();

        dfsHelper(0, adj, visited, result);

        return result;
    }

    public void dfsHelper(
            int vertex,
            ArrayList<ArrayList<Integer>> adj,
            boolean[] visited,
            ArrayList<Integer> result) {

        visited[vertex] = true;

        result.add(vertex);

        for (int neighbor : adj.get(vertex)) {

            if (!visited[neighbor]) {

                dfsHelper(neighbor, adj, visited, result);
            }
        }
    }
}
import java.util.*;

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> res = new ArrayList<>();

        int start = 0;

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {

            int vertex = q.poll();
            res.add(vertex);

            for (int i = 0; i < adj.get(vertex).size(); i++) {

                int neighbor = adj.get(vertex).get(i);

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }

        return res;
    }
}
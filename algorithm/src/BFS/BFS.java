package BFS;
import java.util.*;

public class BFS {
    public static void main(String[] args) {
        int[][] graph = {{}, {2, 3, 8}, {1, 6, 8},{1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};

        System.out.println(bfs(1, graph));
    }

    static String bfs(int start, int[][] graph) {
        StringBuffer sb = new StringBuffer();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];

        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int nodeIndex = q.poll();
            sb.append(nodeIndex + " ");

            for(int i = 0; i < graph[nodeIndex].length; i++) {
                int node = graph[nodeIndex][i];
                if (!visited[node]) {
                    q.offer(node);
                    visited[node] = true;
                }
            }
        }
        return sb.toString();
    }
}

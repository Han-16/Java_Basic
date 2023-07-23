package DFS;

import java.util.Stack;

public class DFS_Stack {

    public static void main(String[] args) {
        int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
        int start = 1;
        System.out.println(bfs(start, graph));
    }

    public static String bfs(int start, int[][] graph) {
        StringBuffer sb = new StringBuffer();
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        visited[start] = true;

        while (!stack.isEmpty()) {
            int node = stack.pop();
            sb.append(node + " ");

            for (int LinkedNode : graph[node]) {
                if (!visited[LinkedNode]) {
                    stack.push(LinkedNode);
                    visited[LinkedNode] = true;
                }
            }
        }


        return sb.toString();
    }

}

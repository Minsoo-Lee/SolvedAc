package class3.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Virus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        List<Integer>[] graph = new ArrayList[N+1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            graph[x].add(y);
            graph[y].add(x);
        }

        boolean[] visited = new boolean[N+1];

        int[] result = {0};
        visited[1] = true;


        DFS(graph, 1, result, visited);

        System.out.println(result[0]);
    }

    private static void DFS(List<Integer>[] graph, int node, int[] result, boolean[] visited) {
        if (graph.length == 0)
            return ;
        for (int i = 0; i < graph[node].size(); i++) {
            if (!visited[graph[node].get(i)]) {
                visited[graph[node].get(i)] = true;
                result[0]++;
                DFS(graph, graph[node].get(i), result, visited);
            }
        }
    }
}

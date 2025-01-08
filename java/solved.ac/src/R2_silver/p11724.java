package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11724 {
    static int nodes;
    static int[][] edges = new int[1001][1001];
    static boolean[] visited = new boolean[500000];
    static int groupCount = 0;
    static int disconnected = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        nodes = Integer.parseInt(tokenizer.nextToken());
        int edgeCount = Integer.parseInt(tokenizer.nextToken());
        int totalGroups = 0;

        for (int i = 0; i < edgeCount; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int from = Integer.parseInt(tokenizer.nextToken());
            int to = Integer.parseInt(tokenizer.nextToken());
            edges[from][to] = edges[to][from] = 1;
        }

        for (int i = 1; i <= nodes; i++) {
            dfs(i);
            if (groupCount > 0) totalGroups++;
            if (disconnected == nodes) totalGroups++;
            groupCount = 0;
            disconnected = 0;
        }
        System.out.println(totalGroups);
    }

    public static void dfs(int current) {
        visited[current] = true;
        for (int next = 1; next <= nodes; next++) {
            if (!visited[next] && edges[current][next] == 1) {
                dfs(next);
                groupCount++;
                disconnected = 0;
            }
            if (edges[current][next] == 0) {
                disconnected++;
            }
        }
    }
}


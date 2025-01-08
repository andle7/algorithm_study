package R3_gold;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p13023 {
    static int N, M;
    static List<Integer>[] adj;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        N = in.nextInt();
        M = in.nextInt();
        
        // 인접 리스트 초기화
        adj = new ArrayList[N];
        for(int i = 0; i < N; i++) {
            adj[i] = new ArrayList<>();
        }
        
        // 간선 입력
        for(int i = 0; i < M; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(b);
            adj[b].add(a);
        }
        
        // 각 노드마다 DFS 시도
        for(int i = 0; i < N; i++){
            visited = new boolean[N];  // 매번 방문 배열 새로 초기화
            if(dfs(i, 1)) {
                System.out.println(1);
                return;  // depth=5 찾으면 바로 종료
            }
        }
        
        // 끝까지 못 찾은 경우
        System.out.println(0);
    }

    static boolean dfs(int node, int depth){
        // depth가 5에 도달하면 연결 관계 발견
        if(depth == 5) {
            return true;
        }
        
        visited[node] = true;
        for(int next : adj[node]){
            if(!visited[next]){
                if(dfs(next, depth + 1)){
                    return true;  // 이미 찾았으면 바로 상위로 true 전달
                }
            }
        }
        visited[node] = false;  // 백트래킹
        
        return false;
    }
}

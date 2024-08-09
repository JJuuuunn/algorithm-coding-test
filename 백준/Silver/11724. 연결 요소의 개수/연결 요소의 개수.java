import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 정점의 수
        int m = Integer.parseInt(st.nextToken()); // 간선의 수

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        // 그래프 초기화
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력받기
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        int count = 0; // 연결 요소의 개수

        // 모든 정점에 대해 DFS 또는 BFS 수행
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) { // 방문하지 않은 노드가 있으면 새로운 연결 요소 발견
                dfs(i);
                count++;
            }
        }

        // 연결 요소의 개수 출력
        System.out.println(count);
    }

    // DFS 구현
    static void dfs(int node) {
        visited[node] = true;
        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}

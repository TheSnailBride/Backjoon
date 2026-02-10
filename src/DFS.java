import java.util.ArrayList;
import java.util.List;

public class DFS {
    // 1. 메서드들이 공용으로 사용할 변수를 static으로 선언
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        // 그래프 초기화 (0번 인덱스는 사용 안 함, 1~4번 노드)
        for(int i = 0; i <= 4; i++){
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(2); graph.get(2).add(1);
        graph.get(1).add(3); graph.get(3).add(1);
        graph.get(2).add(4); graph.get(4).add(2);
        graph.get(3).add(4); graph.get(4).add(3);

        visited = new boolean[5];

        // DFS 시작
        System.out.println("DFS 방문 순서:");
        dfs(4);
    }

    // 2. main 메서드 밖으로 분리 (static 메서드에서 호출하므로 static 선언)
    public static void dfs(int node) {
        visited[node] = true;
        System.out.println("node"+ node + " ");
        System.out.println(graph.get(node));

        for(int next : graph.get(node)) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
}
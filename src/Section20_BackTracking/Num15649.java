package Section20_BackTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num15649 {
    static int N, M;
    static boolean[] visited;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        result = new int[M];

        dfs(0);

        System.out.print(sb);
    }

    static void dfs(int depth) {
        // 1️⃣ 종료 조건
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        // 2️⃣ 1부터 N까지 선택
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;      // 선택
                result[depth] = i;

                dfs(depth + 1);         // 다음 단계

                visited[i] = false;     // 3️⃣ 복구 (백트래킹)
            }
        }
    }
}
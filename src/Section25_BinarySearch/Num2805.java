package Section25_BinarySearch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int max = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) max = arr[i]; // 정렬 대신 최댓값만 찾아도 됨
        }

        // 이분 탐색 범위 설정
        long left = 0;
        long right = max;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0; // 가져갈 수 있는 나무의 총합

            for (int tree : arr) {
                if (tree > mid) {
                    sum += (tree - mid);
                }
            }

            // Parametric Search 핵심 로직
            if (sum >= M) {
                // 나무가 충분함 -> 높이를 더 높여서 최소한만 가져가야 함
                answer = mid;
                left = mid + 1;
            } else {
                // 나무가 부족함 -> 높이를 낮춰야 함
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
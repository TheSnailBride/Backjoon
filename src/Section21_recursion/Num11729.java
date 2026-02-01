package Section21_recursion;

import java.util.Scanner;

public class Num11729{
    public static int count = 0;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();



        hanoi(N, 1, 2, 3);
        System.out.println(count);

        System.out.println(sb);
    }

    public static void hanoi(int n, int start, int via, int to) {
        count ++;
        // Base Case: 옮길 원판이 1개뿐이라면 그냥 목적지로 옮기고 종료
        if (n == 1) {
            sb.append(start).append(" ").append(to).append('\n');
            return;
        }

        // STEP 1: 가장 큰 원판을 제외한 n-1개를 보조 기둥(via)으로 치웁니다.
        // 이때 목적지였던 'to'가 보조 기둥 역할을 수행합니다.
        hanoi(n - 1, start, to, via);

        // STEP 2: 가장 큰 원판(n번째)을 목적지(to)로 옮깁니다.
        sb.append(start).append(" ").append(to).append('\n');

        // STEP 3: 보조 기둥(via)에 치워뒀던 n-1개를 다시 목적지(to)로 옮깁니다.
        // 이때 출발지였던 'start'가 보조 기둥 역할을 수행합니다.
        hanoi(n - 1, via, start, to);
    }
}
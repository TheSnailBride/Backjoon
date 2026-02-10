package Section20_BackTracking;

import java.util.Scanner;

public class Num15649 {
    static int M,N;
    static boolean[] visted;

    static void dfs(int depth){

        if(depth == M) return; //길이 끝나면 종료

        dfs(depth +1); // 다음 조건 찾기

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 1~N;
        int M = sc.nextInt(); //길이

        visted = new boolean[M+1]; // 방문 체크







    }

}

package Section20_BackTracking;

import java.util.Scanner;

public class Num15651 {
    public static int N, M;
    public static int[] result;


    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        result = new int[M];
        dfs(0);

        System.out.print(sb);
    }

    public static void dfs(int depth){
        if(depth == M){ // 끝
            for(int v : result){
                sb.append(v).append(" ");
            }
            sb.append("\n");
            return;


        }

        for(int i=0; i<N; i++){
            //i+1

            result[depth] = i+1; // result[]

            dfs(depth+1);

        }


    }
}

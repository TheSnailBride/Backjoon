package Section20_BackTracking;

import java.util.Scanner;

public class Num15652 {
    public static int result[] ;
    public static int N,M;

    public static StringBuilder sb ;
    public static void main(String[] args) {

        sb = new StringBuilder();
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        result = new int[M];
        dfs(0, 0);

        System.out.println(sb);
    }
    public static void dfs(int depth, int start){
        if(depth == M){
            for(int v : result){
                sb.append(v).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=start; i<N; i++){
                result[depth] = i+1;

                dfs(depth+1, i);


        }
    }



}

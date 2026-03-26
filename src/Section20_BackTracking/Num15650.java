package Section20_BackTracking;

import java.util.Scanner;

public class Num15650 {
    public static int N, M;
    public static int[] arr;
    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        N = in.nextInt(); //1~N
        M = in.nextInt(); //M개

        arr  = new int[M];

        visited = new boolean[N];


        dfs(1,0);
    }

    public static void dfs(int start, int depth){


        if(depth == M){
            for( int v : arr){
                System.out.print(v + " ");
            }
            System.out.println();
            return;
        }


        for(int i= start; i<=N; i++){
            arr[depth] = i;

            dfs(i+1, depth +1);

        }

    }







}



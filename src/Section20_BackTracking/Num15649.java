package Section20_BackTracking;

import java.util.Scanner;

public class Num15649 {
    public static int N, M;
    public static int[] arr;
    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        N = in.nextInt(); //1~N
        M = in.nextInt(); //M개

        arr  = new int[M];

        visited = new boolean[N];


        dfs(0);
    }

    public static void dfs(int depth){


        if(depth == M){
            for( int v : arr){
                System.out.print(v + " ");
            }
            System.out.println();
            return;
        }


        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i+1;

                dfs(depth+1);

                visited[i] = false;


            }

        }

    }







}



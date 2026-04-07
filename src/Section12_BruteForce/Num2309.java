package Section12_BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class Num2309 {
    static boolean[] visited = new boolean[9];
    static int[] arr ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        arr = new int[9];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        bfs(arr, 0, 0, 0);

    }
    public static void bfs(int[] a, int start, int depth, int currentSum){


        if(depth == 7){ // 종료조건
            if(currentSum == 100){
                for(int i =0; i<a.length; i++){
                    if(visited[i]) System.out.println(a[i]);
                }
                System.exit(0);

            }
            return;
        }

        for(int i = start ; i<9; i++){ // 반복문
            visited[i] = true;
            bfs(a,i+1, depth+1, currentSum+a[i]);
            visited[i] = false;

        }


    }
}

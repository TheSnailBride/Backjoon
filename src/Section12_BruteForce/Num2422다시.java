package Section12_BruteForce;

import java.util.Scanner;

public class Num2422다시 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        boolean[][] bad = new boolean[N+1][N+1];
        for(int i=0; i<M; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            bad[a][b] = true;
            bad[b][a] = true;
        }

        int count =0;

        for(int i=1; i<=N; i++){
            for(int j = i+1; j<=N; j++){
                if(bad[i][j]) continue; // true 면 하던거 멈추고 다시
                for(int k = j+1; k <= N; k++){
                    if(!bad[i][k] && !bad[j][k]) count++;
                }
            }
        }

        System.out.println(count);
    }
}



package Section12_BruteForce;

import java.util.Scanner;

public class Num2422다시 {
    public static boolean[] visited ;
    public static int[][] mix;
    public static int count =0;
    public static int N;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt(); //3개 만 선택할거임 중복 ㄴㄴ
        visited = new boolean[N+1];

        int M = in.nextInt();

        mix = new int[M][2]; //섞어치기  ㄴㄴ
        for(int i=0; i<M; i++){
            for(int j=0; j<2; j++){
                mix[i][j] = in.nextInt();
            }
        }
        search(1,0);

        System.out.println(count);

    }
    public static void search(int start, int depth){
        // 3개 체크하면 끝 -> 먹으면 안되는 조합인거 체크하면 댐
        if(depth == 3){
            if(isPossible()) count++ ;
            return ;
        }
        //반복문 모든 3자리 조합
        for(int i=start; i<visited.length; i++){
            if(!visited[i]){
                visited[i] = true;
                search(i+1, depth+1);
                visited[i] = false;
            }
        }
    }
    public static boolean isPossible(){

        for (int[] ints : mix) {
            int a = ints[0];
            int b = ints[1];

            if(visited[a] == true && visited[b] == true){
                return false;
            }

        }
        return true;
        }


    }



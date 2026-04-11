package Section12_BruteForce;

import java.util.Scanner;

public class Num16439 {
    public static boolean[] visited;
    public static int max =0;
    public static int[][] arr;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); // N명
        int M = in.nextInt(); // 각 사람의 치킨 선호도

        visited = new boolean[M]; // 치킨의 개수에 따른 점수 값
        arr = new int[N][M];

        for(int i=0; i<N; i++){ //n
            for(int j=0; j<M; j++){
                arr[i][j] = in.nextInt();
            }
        }

        search(0,0);
        System.out.println(max);


    }

    public static void search(int depth, int start){
        //3개의 조합을 고르고 -> 각 사람들의 선호도를 계산해서 최대값 갱신

        if(depth == 3){
            //선호도 계산
            max = Math.max(max, calcMax());
            return;
        }

        for(int i=start; i<visited.length; i++){ // 치킨 3개 고르기
            if(!visited[i]){
                visited[i] = true;
                search(depth+1, i+1);
                visited[i] = false;
            }
        }

    }
    public static int calcMax(){
        int sum =0;
        int[] visitedCheck =new int[3]; // nullponint
        int count=0;
        for(int i=0; i<visited.length; i++){
            if(visited[i]){
                visitedCheck[count++] = i;// 어디 방문했는지 알게
            }
        }

        for(int i=0; i< arr.length; i++){
            int a = arr[i][visitedCheck[0]];
            int b = arr[i][visitedCheck[1]];
            int c = arr[i][visitedCheck[2]];

            sum += Math.max(Math.max(a,b),c); // 최대 값 한개를 더함
        }

        return sum;
    }
}

package Section12_BruteForce;

import java.util.Scanner;

public class Num9095 {
    static int count ;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for(int i=0; i<N; i++){
            count =0;
            int a = in.nextInt();
            bfs(a,0);
            System.out.println(count);
        }


    }
    public static void bfs( int target, int currentSum){
        //1,2,3 을 갖고 만들기
        //종료조건
        if(currentSum == target){
            count++;
            return;
        }
        if(currentSum> target){
            return;
        }
        //반복문
        for(int i=1; i<4; i++){
            //체크 안해도 되고
            bfs(target,currentSum+i); //현재까지 더한 값 넘겨주고 DP 로 풀 수 있네
        }
    }
}

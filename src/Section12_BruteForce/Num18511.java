package Section12_BruteForce;

import java.util.Scanner;

public class Num18511 {
    public static boolean[] visited = new boolean[9];
    public static int max ;
    public static int N;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt(); //자리수를 알아야할듯
        int K = in.nextInt(); // k 1~3;




        for(int i=0; i<K; i++){
            visited[in.nextInt()-1] = true; //방문 체크
        }

        search(0);

        System.out.println(max);
    }
    public static void search(int sum){
        // N 보다 작거나 같은 수 들중에 배열에 있는 수자들로만 구성되어야함 중복가능
        //자릿수를 인위적으로 만들지 말고 재귀를 반복하면서 자릿수를 추가하면 되네
        if(sum > N){
            return; // N보다 합이 크면 종료
        }
        if(sum <=N){ //최대값 갱신
            max = Math.max(sum,max);

        }

        // 3 30 300

        for(int i=0; i<visited.length;i++){

            if(visited[i]){
                search(sum*10 + (i+1));
            }
        }

    }

}

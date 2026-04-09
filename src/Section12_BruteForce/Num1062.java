package Section12_BruteForce;

import java.util.Scanner;

public class Num1062 { // char -'a' 숫자 변환 for 2중일때 마지막 체크
    public static int K;
    public static boolean[] visited = new boolean[26];
    public static String[] arr ;

    public static int maxRead=0
            ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        K = in.nextInt();

        arr = new String[N]; //anta tica

        visited[0] = true;
        visited['n'-'a'] = true;
        visited['t' -'a'] = true;
        visited['i'-'a'] = true;
        visited['c'-'a']=true;

        for(int i=0; i<N; i++){
            arr[i] = in.next(); // a, n, t, i, c 기본으로 5개는 알아야 함
        }
        if(K<5) {
            System.out.println(0); //5보다 작으면 읽을 수 없음
            return ;
        }


        //최대한 많은 글자

        search(0,5);

        System.out.println(maxRead);

    }
    public static void search(int visited_num, int count){

        if(count == K){

           maxRead = Math.max(maxRead,canRead());

           return;
        }


        for(int i=visited_num; i<visited.length; i++){
            if(!visited[i]) {
                visited[i] = true;
                search(i + 1, count + 1);
                visited[i] = false;
            }
        }

    }
    public static int canRead(){
        int can =0;
        for(int i=0; i<arr.length; i++){
            boolean check = true; //
            for(int j=0; j<arr[i].length(); j++ ){ // 앞 4 뒤 4 읽을 필요 없음
                int target = arr[i].charAt(j) -'a';
                if(!visited[target]) {
                    check = false;
                    break;
                }

            }
            if(check) can++;
        }
        return can;
    }
}

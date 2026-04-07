package Section20_BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2503 {

    static int[] selection = new int[3];
    static boolean visited[] = new boolean[10];
    static ArrayList<Integer>[] list ;
    static int N;

    static int ans = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        list = new ArrayList[N];

        for(int i=0; i<N; i++){

            list[i] = new ArrayList<>(); //초기화

            StringTokenizer st = new StringTokenizer(br.readLine());

            list[i].add(Integer.parseInt(st.nextToken()));

            list[i].add(Integer.parseInt(st.nextToken())); //strike
            list[i].add(Integer.parseInt(st.nextToken())); // ball

        }
        make(0);

        System.out.println(ans);




    }
    public static void make(int depth){

        if(depth == 3){
            boolean isAnswer = true;

            //selection 과 list[i].get(0)의 값을 나눠
            // 자릿수와 숫자 같으면 스트라이크
            // 자릿수 다르고 숫자 같으면 볼

            for(int i=0 ; i<N; i++){

                int s_cnt = 0;
                int b_cnt = 0;

                int num = list[i].get(0); //432
                int first_num = num/100;
                int second_num = (num/10)%10;
                int third_num = num%10;

                int[] target = {first_num, second_num, third_num};


                for (int j = 0; j < 3; j++) { //(selection)
                    for (int k = 0; k < 3; k++) {

                        if (selection[j] == target[k]) { // 숫자가 같을 때!
                            if (j == k) {
                                s_cnt++;
                            } else {
                                b_cnt++;
                            }
                        }
                    }
                }

                int real_s = list[i].get(1);
                int real_b = list[i].get(2);

                if (s_cnt != real_s || b_cnt != real_b) {
                    // 하나라도 다르면 이 숫자는 탈출!
                    isAnswer = false;
                    break;
                }



            }


            if(isAnswer) ans++;
            return ;
        } // 깊이가 3이면 끝남

        //반복문

        for(int i = 1; i<10; i++){
            if(!visited[i]){ // 방문하지 않았으면
                selection[depth] = i;
                visited[i] = true;
                make(depth+1);
                visited[i] = false;
            }

        }


    }
}

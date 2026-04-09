package Section12_BruteForce;

import java.util.Scanner;

public class Num18312 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); // 00 시 00분 00초 ~~ N 시 00분 00초 까지
        int K = in.nextInt(); // 중에 K 가 포함되는 개수


        int count =0;
        for(int hour = N ; hour >= 0 ; hour--){
            for(int minute = 59; minute >=0; minute--){
                for(int second = 59; second>=0; second--){
                    // 23
//                    if(hour/10==K || hour%10 == K) {
//                        count ++;
//                        break;
//                    }
//                    if(minute/10==K || minute%10 == K) {
//                        count ++;
//                        break;
//                    }
//                    if(second/10==K || second%10 == K) {
//                        count ++;
//                        break;
//                    }

                    if ((hour / 10 == K || hour % 10 == K) ||
                            (minute / 10 == K || minute % 10 == K) ||
                            (second / 10 == K || second % 10 == K)) {

                        count++;
                    }
                }
            }
        }


        System.out.println(count);
    }

}

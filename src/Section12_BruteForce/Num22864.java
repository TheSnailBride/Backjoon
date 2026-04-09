package Section12_BruteForce;

import java.util.Scanner;

public class Num22864 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt(); //1시간 일하면 피로도 +A
        int B = in.nextInt(); //1시간 일하면 일 +B
        int C = in.nextInt(); //1시간 휴식 피로도 -C 0이하로 내려가지 않음
        int M = in.nextInt(); // M 이 넘지 않게 피로도 M넘지 않게

        int fatigue =0; //피로도 0
        int focusTime =0;

        for(int i=0; i<24; i++){

            if(M<A) break; //번아웃

            if(fatigue +A <= M){ //1시간 일하기 현재피로도 9 일때 일하면 +4 이면 M을 10을 넘겨버림 조건추가 넘지 않게!!
                fatigue+=A; //피로도 높아지고
                focusTime+=B;
            }else{ //1시간 휴식하기
                fatigue-=C;
                if(fatigue<0) fatigue=0;
            }
        }
        System.out.println(focusTime);

    }
}

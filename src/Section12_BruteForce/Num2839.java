package Section12_BruteForce;

import java.util.Scanner;

public class Num2839 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int hap;

            //n을 5로 나눈 몫 , n의 나머지 , hap 에는 몫을 넣는다

        hap = n / 5 ; //n을 5로 나눈 몫
        n = n % 5; // 나머지 개수 초기화

        if(n>=3){
            hap++;
            n=n-3;
        }
        if(n!=0) {
            System.out.println(-1);
        }else{
            System.out.println(hap);
        }


    }
}

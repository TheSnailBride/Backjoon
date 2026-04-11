package Section12_BruteForce;

import java.util.Scanner;

public class Num17626 {
    public static int n;
    public static int min =10;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        search(0,0,0);

        System.out.println(min);
    }
    public static void search(int start, int digit,int sum){
        //종료조건
        if(sum == n){ //최소값
            min = Math.min(digit, min);
            return;
        }
        if(sum > n){
            return;
        }

        //종료조건 값이 n 보다 크거나 n 이랑 같을때 // 자릿수를 카운팅 해야함
        for(int i=start; i*i<=n; i++){ //언제까지 돌아야 하려나
            System.out.println(digit+1 +",  " + sum + (int)Math.pow(i,2));
            search(i+1,digit+1, sum + (int)Math.pow(i,2));

        }
    }
}

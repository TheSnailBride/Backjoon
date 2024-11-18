package Section09_Integer;

import java.util.Scanner;

public class 소수_Num2581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();
        int min =0;
        int hap =0;
        boolean flag = false;
        for(int i=M; i<=N; i++){
            if(isPrime(i)){
                if(flag == false) {
                    flag = true;
                    min =i;
                }

                hap+=i;

            }
        }
        if(min==0){
            System.out.println(-1);
        }else{
            System.out.println(hap);
            System.out.println(min);
        }


    }
    public static Boolean isPrime(int n){
        if(n == 1 ) return false;
        for(int i=2; i<n; i++){
            if( n%i ==0) return false;
        }
        return true;
    }

}

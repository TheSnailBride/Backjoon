package Section09_Integer;

import java.util.Scanner;

public class 소수찾기_Num1978 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        int result =0;

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
            if( isPrime(arr[i]) ) result++;
        }
        System.out.println(result);
    }
    public static Boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}

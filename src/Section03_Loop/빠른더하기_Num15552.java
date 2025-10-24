package Section03_Loop;

import java.util.Scanner;

public class 빠른더하기_Num15552 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        int[] array = new int[n];
        for(int i=0; i<n; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            array[i] = a+b;
        }

        for(int result : array){
            System.out.println(result);
        }
    }
}

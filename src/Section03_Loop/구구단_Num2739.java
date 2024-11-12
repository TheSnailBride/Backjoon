package Section03_Loop;

import java.util.Scanner;

public class 구구단_Num2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i=1; i<=9 ; i++ ){
            System.out.printf( "%s * %s = %s \n", n,i ,(i*n));
        }
    }
}

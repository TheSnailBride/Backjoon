package Section21_recursion;

import java.util.Scanner;

public class 피보나치수_Num10870 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        System.out.println(fibonacci(num));
    }
    public static int fibonacci(int n){
        if(n<=1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);


    }
}

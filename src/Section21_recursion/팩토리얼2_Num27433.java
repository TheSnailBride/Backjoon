package Section21_recursion;

import java.util.Scanner;

public class 팩토리얼2_Num27433 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        System.out.println(factorial(num));

    }

    public static long factorial(int a){
        if(a<=0) return 1;

        return a*factorial(a-1);


    }
}

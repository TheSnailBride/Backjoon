package Section17;

import java.util.Scanner;

public class Num10872 {
    static int fact(int a){
        if(a == 0) return 1;
        int hap = a * fact(a-1);
        return hap;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(fact(N));



    }
}

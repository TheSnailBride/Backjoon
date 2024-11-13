package Section08_Math1;

import java.util.Scanner;

public class 진법변환2_Num11005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int B = in.nextInt();

        System.out.println((Integer.toString(N,B)).toUpperCase());
    }
}

package Section08_Math1;

import java.util.Scanner;

public class 진법변환_Num2745 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String N = in.next();
        int B = in.nextInt();

        System.out.println(Integer.parseInt(N, B));


    }
}

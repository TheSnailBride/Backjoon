package Section01;

import java.util.Scanner;

public class exam10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();


        int b_first = b/100;
        int b_second = (b/10)%10;
        int b_last = b%10;


        System.out.println(a * b_last);
        System.out.println(a * b_second);
        System.out.println(a * b_first );
        System.out.println(a * b_last + (a * b_second)*10 + (a * b_first)*100);

    }
}

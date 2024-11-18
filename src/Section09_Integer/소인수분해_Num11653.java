package Section09_Integer;

import java.util.Scanner;

public class 소인수분해_Num11653 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i <= n; i++) {


            while (n % i == 0) {

                    System.out.println(i);
                    n/=i;

            }

        }
    }
}

package Section08_Math1;

import java.util.Scanner;

public class Num2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 1;  // 반복횟수
        int range = 2; // 통과

        if (N == 1) {
            System.out.println(N);
        } else {
            while (range <= N) {

                range = range + (6 * count);
                count++;

            }
            System.out.println(count);
        }
    }
}

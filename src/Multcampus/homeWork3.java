package Multcampus;

import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("3이상의 수를 입력하시오");
        int N = sc.nextInt();

        int half = N / 2;

        // ▲ 위쪽 (가운데 포함)
        for (int i = 0; i <= half; i++) {
            for (int j = 0; j < half - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ▼ 아래쪽
        for (int i = half - 1; i >= 0; i--) {
            for (int j = 0; j < half - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

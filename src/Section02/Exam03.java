package Section02;

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();


        //4의 배수이면서 100의 배수는 아닌 것

        if (a % 4 == 0) {
            if (a % 100 != 0 && a % 400 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}

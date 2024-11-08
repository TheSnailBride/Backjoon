package Section01;

import java.util.Scanner;

public class exam06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextInt();
        double b = in.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    }
}


//첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
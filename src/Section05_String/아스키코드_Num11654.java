package Section05_String;

import java.util.Scanner;

public class 아스키코드_Num11654 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();


        char c = input.charAt(0);

        int num = (int) c;

        System.out.println(num);

    }
}

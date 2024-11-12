package Section05_String;

import java.util.Scanner;

public class 숫자의합_Num11720 {
    public static void main(String[] args) {
        int hap =0;

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        String str = in.next();
        in.close();

        for(int i=0; i<num; i++){
            hap += str.charAt(i) - '0';
        }
        System.out.println(hap);


    }
}

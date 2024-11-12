package Section03_Loop;

import java.util.Scanner;

public class 합_Num8393 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hap =0;
        int n = in.nextInt();

        for(int i=1; i<=n; i++){
            hap += i;
        }
        System.out.println(hap);
    }
}

package Section03_Loop;

import java.util.Scanner;

public class 코딩은체육_Num25314 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String str = "";

        for(int i=1; i<=n/4; i++){
            str +="long ";
        }

        System.out.println(str+"int");
    }
}

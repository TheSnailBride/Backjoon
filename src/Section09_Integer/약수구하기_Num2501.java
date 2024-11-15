package Section09_Integer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 약수구하기_Num2501 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i=1; i<=a; i++) {
            if (a % i == 0) {
                list.add(i);
            }

        }
        if(list.size()>= b-1) System.out.println(list.get(b-1));
        else System.out.println(0);

    }
}

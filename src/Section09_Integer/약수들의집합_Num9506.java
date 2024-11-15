package Section09_Integer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 약수들의집합_Num9506 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            int hap =0;
            int num = in.nextInt();
            if(num == -1 || num ==0) break;

            List<Integer> list = new ArrayList<>();
            for(int i=1; i<=num/2; i++){

                if(num % i ==0) {
                    hap += i;
                    list.add(i);
                }
            }

            if(hap == num){
                System.out.print(num+" = ");
                for(int i=0; i<list.size()-1; i++){
                    System.out.print(list.get(i) +" + ");
                }
                System.out.print(list.get(list.size()-1));
                System.out.println();

            }else{
                System.out.print(num + " is NOT perfect.");
                System.out.println();
            }

        }

    }
}
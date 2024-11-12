package Section02;

import java.util.Scanner;

public class Exam07 {
    public static void main(String[] args) {
        int prise;
        int big;
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a == b && b==c){
            prise = 10000 + a*1000;
        }else if (a == b ){
            prise = 1000 + a * 100;
        }else if( b== c){
            prise = 1000 + b * 100;

        } else if (a == c) {
            prise = 1000 + a * 100;
        }else {
            big = Math.max(a,b);
            big = Math.max(big ,c );
            prise = big * 100;
        }


        System.out.println(prise);
    }
}

package Section02;

import java.util.Scanner;

public class Exam07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a == b && b==c){
            int prise = 10000 + a*1000;
        }else if (a==b || b==c || a==c){
            int prise = 1000;
        }

    }
}

package Section02;

import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if(a>0){
            if(b>0) System.out.println("1");
            if(b<0) System.out.println("4");
        }else{
            if(b>0) System.out.println(2);
            if(b<0) System.out.println(3);
        }
    }
}

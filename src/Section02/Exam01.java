package Section02;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();

        String[] arr=a.split(" ");

        int A = Integer.valueOf(arr[0]);
        int B = Integer.valueOf(arr[1]);

        if(A>B){
            System.out.println(">");
        }else if(A<B){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
    }
}

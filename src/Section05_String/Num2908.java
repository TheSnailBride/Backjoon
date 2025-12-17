package Section05_String;

import java.util.Scanner;

public class Num2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String a1="" , b1 ="";

        for(int i=a.length()-1; i>=0; i--){
            a1 += a.charAt(i);
            b1 += b.charAt(i);
        }

        int ar = Integer.parseInt(a1);
        int br = Integer.parseInt(b1);

        if(ar>br) System.out.println(a1);
        else System.out.println(b1);
    }
}

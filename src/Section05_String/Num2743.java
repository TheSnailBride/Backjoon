package Section05_String;

import java.util.Scanner;

public class Num2743 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();


        int num =0;
        for(int i=0; i<str.length(); i++){
            num++;
        }

        System.out.println(num);
    }
}

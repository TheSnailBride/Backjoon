package Section03_Loop;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 빠른더하기_Num15552 {
    public static void main(String[] args) throws IOException {


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        int[] array = new int[n];
        for(int i=0; i<n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int sum = a+b;

            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        bw.flush();


    }
}

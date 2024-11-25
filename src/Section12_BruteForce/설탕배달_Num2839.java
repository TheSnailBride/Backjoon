package Section12_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 설탕배달_Num2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sugar = Integer.parseInt(br.readLine());

        int result =0;
        int n=0;

        System.out.println(calc(sugar, 5, 0));
        System.out.println(calc(sugar,3,0));




    }
    public static int calc(int hap, int bag, int n ){
        hap -= bag;
        n++;
        calc(hap, 5,n);
        calc(hap,3,n);

        if(hap !=0 ) return -1;
        if(n==0) return -1;

        return n;
    }
}

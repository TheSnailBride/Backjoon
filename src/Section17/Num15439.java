package Section17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Num15439 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N==1) System.out.println(0);
        else System.out.println(N*(N-1));
    }
}

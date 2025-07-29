package Section08_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달팽이올라가고싶다_Num2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());


        int day = 1;
        int m =A;

        while( m < V ){
            day++;
            m = m + A;
            if(m >= V) break;
            m -=B;
        }
        System.out.println(day);
    }
}

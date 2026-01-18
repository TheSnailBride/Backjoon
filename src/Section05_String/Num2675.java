package Section05_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2675 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken()); //p번 반복
        String s = st.nextToken();

        for(int j=0; j<s.length(); j++){

            int start =0;
            while(start < p) {
                sb.append(s.charAt(j));
                start++;
            }

        }
            sb.append("\n");


        }
        System.out.println(sb.toString());


    }
}

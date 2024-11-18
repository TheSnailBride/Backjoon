package Section10_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 직사각형에서탈출_Num1085 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());


        //w, h 직사각형


        int left = x;
        int right = w - x;
        int up = h - y ;
        int bottom = y;


        int min =Math.min(Math.min(left, right),Math.min(up, bottom));
        System.out.println(min);





    }
}

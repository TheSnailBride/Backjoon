package Section10_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class 대지_Num9063 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        int[][] array = new int[n][2];

        int width_min = Integer.MAX_VALUE;
        int width_max = Integer.MIN_VALUE;
        int height_min = Integer.MAX_VALUE;
        int height_max = Integer.MIN_VALUE;

        for(int i =0; i<n; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());


            width_max = Math.max(array[i][0], width_max);
            width_min = Math.min(array[i][0], width_min);

            height_max = Math.max(array[i][1], height_max);
            height_min = Math.min(array[i][1], height_min);


        }
        int area = (width_max - width_min) * (height_max - height_min);
        System.out.println(area);
    }
}

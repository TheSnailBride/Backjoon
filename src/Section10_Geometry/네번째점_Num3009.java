package Section10_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 네번째점_Num3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int left1, right1, left2, right2, left3, right3;

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        left1 = Integer.parseInt(st1.nextToken());
        right1 = Integer.parseInt(st1.nextToken());

        // 두 번째 점의 좌표 읽기
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        left2 = Integer.parseInt(st2.nextToken());
        right2 = Integer.parseInt(st2.nextToken());

        // 세 번째 점의 좌표 읽기
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        left3 = Integer.parseInt(st3.nextToken());
        right3 = Integer.parseInt(st3.nextToken());



        int left4 =0;
        int right4 =0 ;
        if(left1 == left2) left4 = left3;
        if(left1 == left3) left4 = left2;
        if(left2 == left3) left4 = left1;

        if(right1 == right2) right4 = right3;
        if(right1 == right3) right4 = right2;
        if(right2 == right3) right4 = right2;

        System.out.println(left4+" "+right4);
    }
}

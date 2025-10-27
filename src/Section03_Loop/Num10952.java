package Section03_Loop;

import java.util.Scanner;

public class Num10952 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();


            System.out.println(a+b);
        }
    }
}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer; // StringTokenizer 임포트
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st; // 쪼개는 도구
//
//        // 첫 번째 줄 (10 10)
//        st = new StringTokenizer(br.readLine()); // "10 10"을 읽고 쪼갤 준비
//        int a = Integer.parseInt(st.nextToken()); // 첫 번째 "10"
//        int b = Integer.parseInt(st.nextToken()); // 두 번째 "10"
//
//        // 두 번째 줄 (20 20)
//        st = new StringTokenizer(br.readLine()); // "20 20"을 읽고 쪼갤 준비
//        int c = Integer.parseInt(st.nextToken()); // 첫 번째 "20"
//        int d = Integer.parseInt(st.nextToken()); // 두 번째 "20"
//
//        System.out.println("첫째 줄: " + a + ", " + b);
//        System.out.println("둘째 줄: " + c + ", " + d);
//
//        br.close();
//    }
//}

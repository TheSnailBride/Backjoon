package Section03_Loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Num11021 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1. T (테스트 케이스 수) 입력
        int T = Integer.parseInt(br.readLine());

        for(int i=1; i<= T; i++){
            // 2. 한 줄을 읽고 바로 StringTokenizer에 넘깁니다.
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 3. 같은 StringTokenizer를 사용하여 A와 B를 순차적으로 가져옵니다.
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // 4. 결과를 StringBuilder에 저장
            sb.append("Case #").append(i).append(": ").append(A + B).append("\n");
        }

        // 5. 최종 출력
        System.out.print(sb.toString());
        br.close();
    }
}

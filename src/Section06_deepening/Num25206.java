package Section06_deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double totalScore = 0; // (학점 * 평점)의 합
        double totalCredit = 0; // 학점의 총합
        for (int i = 0; i < 20; i++) {
            String s = bf.readLine(); // 반복문 안에서 읽어야 함
            if (s == null) break;

            StringTokenizer st = new StringTokenizer(s);
            String sub = st.nextToken();
            double credit = Double.parseDouble(st.nextToken()); // 학점은 실수(3.0 등)
            String grade = st.nextToken();

            if (grade.equals("P")) {
                continue;
            }

            totalCredit += credit;

            if (grade.equals("A+")) totalScore += (credit * 4.5);
            else if (grade.equals("A0")) totalScore += (credit * 4.0);
            else if (grade.equals("B+")) totalScore += (credit * 3.5);
            else if (grade.equals("B0")) totalScore += (credit * 3.0);
            else if (grade.equals("C+")) totalScore += (credit * 2.5);
            else if (grade.equals("C0")) totalScore += (credit * 2.0);
            else if (grade.equals("D+")) totalScore += (credit * 1.5);
            else if (grade.equals("D0")) totalScore += (credit * 1.0);
            else if (grade.equals("F")) totalScore += (credit * 0.0);
        }

        System.out.printf("%.6f", totalScore / totalCredit);    }
}
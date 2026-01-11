package Section13_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Num1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] st = new String[n];

        for(int i=0; i<st.length; i++){
            st[i] = sc.nextLine();
        }
        Arrays.sort(st, (s1, s2) -> {
            // 조건 1: 길이가 다르면 길이 오름차순
            if (s1.length() == s2.length()) {
                return s1.length() - s2.length();
            }
            // 조건 2: 길이가 같으면 사전순 (String의 기본 compareTo 사용)
            return s1.compareTo(s2);
        });

        for(String s : st) {
            System.out.println(s);
        }

    }
}

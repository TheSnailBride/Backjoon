package Section20_BackTracking;

import java.util.Scanner;

public class Num14888 {
    public static int N;
    public static int[] arr;
    public static int[] operator;
    public static int maxValue = Integer.MIN_VALUE;
    public static int minValue = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        arr = new int[N];
        for(int i=0; i<N; i++){ //숫자 배열
            arr[i] = in.nextInt();
        }
        operator = new int[4];
        for(int i=0; i<4; i++){ //연산자 입력
            operator[i] = in.nextInt();
        }

        backtrack(1,arr[0]);

        System.out.println(maxValue);
        System.out.println(minValue);
    }

    // 예시: 숫자가 [2, 3, 5]이고 연산자가 [+: 1개, -: 1개] 일 때
    public static void backtrack(int idx, int currentSum) {
        // 1. [탈출 조건] "나 숫자 다 썼나?"
        // 만약 idx가 숫자 개수(N)와 같다면? -> 최댓값/최솟값 갱신하고 끝내기!
        if(idx == N){
            if (currentSum > maxValue){
                maxValue = currentSum;
            }
            if(currentSum < minValue){
                minValue = currentSum;
            }
        }

        // 2. [가지 뻗기] "지금 쓸 수 있는 연산자가 뭐가 있지?"
        // 연산자 종류가 4개니까, 0부터 3까지 반복문을 돌려보자!
        for (int i = 0; i < 4; i++) {
            // "i번째 연산자(예: +)의 남은 개수가 0보다 큰가?"
            if (operator[i] > 0) {

                // (1) 연산자 하나 썼으니까 개수 줄이기!
                operator[i]--;

                // (2) 다음 숫자로 넘어가기!
                // 새로운 결과값 = (currentSum) [i번째 연산자] (numbers[idx])
//                int nextSum = currentSum; // 임시 변수
                if (i == 0) backtrack(idx + 1, currentSum + arr[idx]);
                else if (i == 1) backtrack(idx + 1, currentSum - arr[idx]);
                else if (i == 2) backtrack(idx + 1, currentSum * arr[idx]);
                else if (i == 3) backtrack(idx + 1, currentSum / arr[idx]);

                // (3) 중요! "자, 이제 다른 길도 가봐야지?"
                // 다시 연산자 개수 돌려놓기 (복구가 핵심!)
                operator[i]++;
            }
        }
    }
}

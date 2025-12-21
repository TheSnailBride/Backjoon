package Section04_Array;

import java.util.Scanner;

public class 공바꾸기_Num10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;

        }
        for(int a : arr) System.out.print(a+" ");
    }
}

package Section03_Loop;

import java.util.Scanner;

public class 반복더하기빼기_Num10950 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] = a+b;
        }
        for(int hap : arr){
            System.out.println(hap);
        }
    }
}

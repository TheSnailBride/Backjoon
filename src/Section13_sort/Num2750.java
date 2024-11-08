package Section13_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Num2750 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr=new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

package Section13_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Num2587 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        int[] arr = new int[5];
        int hap =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            hap +=arr[i];
        }

        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);
        System.out.println(hap/arr.length);
    }
}


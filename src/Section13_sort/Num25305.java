package Section13_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Num25305 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int prize = in.nextInt();

        Integer[] arr = new Integer[n];

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }


        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[prize-1]);
    }
}

package Section07_MultiArray;

import java.util.Scanner;

public class 최대값_2566 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];

        int max = 0;
        int max_i=0;
        int max_j=0;
        Scanner in = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = in.nextInt();
                if(max<arr[i][j]) {
                    max = arr[i][j];
                    max_i=i;
                    max_j=j;
                }
            }
        }
        System.out.println(max);
        System.out.println((max_i+1) + " " + (max_j+1));


    }
}

package Section08_Math1;

import java.util.Scanner;

public class 세탁소사장동혁_Num2720 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double change;
        int[][] arr = new int[n][4];

        for(int i=0; i<arr.length; i++){
            change = in.nextDouble();
            arr[i][0] = (int)(change/25);
            change %= 25;
            arr[i][1] = (int)(change/10);
            change %=10;
            arr[i][2] = (int)(change/5);
            change %= 5;
            arr[i][3] = (int)change;

        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

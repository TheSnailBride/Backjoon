package Section04_Array;

import java.util.Scanner;

public class 작은수_Num10871 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int num = in.nextInt();
        int big = in.nextInt();


        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = in.nextInt();
        }

        for(int target : arr){
            if(target < big){
                System.out.print(target+" ");
            }
        }
    }
}

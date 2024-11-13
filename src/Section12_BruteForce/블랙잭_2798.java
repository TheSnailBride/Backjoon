package Section12_BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class 블랙잭_2798 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int target = in.nextInt();


        int[] arr = new int[num];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }



        System.out.println(search(arr, target));



    }
    public static int search(int[] arr, int target){

        int hap = 0;
        int max_hap=0;
        for(int i=0; i<arr.length-2; i++){
            for(int j =i+1; j<arr.length-1; j++){
                for(int k =j+1; k<arr.length; k++){
                    hap = arr[i]+arr[j]+arr[k];
                    if(hap<=target && max_hap<=hap) {
                        max_hap = hap;
                    }
                }
            }
        }
        return max_hap;
    }

}

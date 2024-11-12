package Section04_Array;

import java.util.Scanner;

public class 개수세기_Num10807 {
    public static void main(String[] args) {

        int count =0;
        Scanner in =new Scanner(System.in);

        int num = in.nextInt();

        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();

        for(int n : arr ){
            if(target == n){
                count ++;
            }
        }
        System.out.println(count);
    }
}

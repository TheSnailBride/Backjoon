package Section04_Array;

import java.util.Scanner;

public class 과제_Num5597 {
    public static void main(String[] args) {
        int[] array = new int[30];

        Scanner in = new Scanner(System.in);

        for(int i=0; i<28 ;i++){
            int num = in.nextInt();
            array[num-1] =-1;
        }

        int first = 0;
        int second =0;
        for(int i=0; i<30; i++){
            if(array[i]==0){

                if(first ==0){
                    first = i+1;
                }else{
                    second = i+1;
                    break;
                }
            }
        }


        System.out.println(first);
        System.out.println(second);



    }
}

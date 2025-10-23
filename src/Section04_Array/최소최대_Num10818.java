package Section04_Array;

import java.util.Scanner;

public class 최소최대_Num10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int[] array = new int[num];

        for(int i=0; i<num; i++){
            array[i] = in.nextInt();
        }

        int min = array[0];
        int max = array[0];


        for(int i =1; i<num; i++){
            if(array[i]<min) min = array[i];
            if(array[i]>max) max = array[i];

        }

        System.out.println(min+" "+max);


    }
}

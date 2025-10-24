package Section04_Array;

import java.util.Scanner;

public class 최댓값_Num2562 {
    public static void main(String[] args) {


        int[] array = new int[9];

        Scanner in = new Scanner(System.in);

        int max =0;
        int index =0;
        for(int i=0; i<array.length; i++){

            array[i] = in.nextInt();

            if(max<array[i]) {
                max = array[i];
                index = i+1;
            }


        }
        System.out.println(max);
        System.out.println(index);



    }
}

package Section04_Array;

import java.util.Scanner;

public class 평균_Num1546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double max = 0;
        int num = in.nextInt();

        double[] arr = new double[num];

        for(int i = 0; i<num; i++){
            arr[i] = in.nextDouble();
            if (arr[i] > max) max = arr[i];
        }

        double hap =0;

        for(int i=0; i<num; i++){
            arr[i] = arr[i]/max*100;
            hap +=arr[i];
        }
        System.out.println(hap/num);
    //최고점, 최저점 두개 구해서

    }
}

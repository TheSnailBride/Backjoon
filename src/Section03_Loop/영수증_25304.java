package Section03_Loop;

import java.util.Scanner;

public class 영수증_25304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int price = in.nextInt();

        int num = in.nextInt();
        int hap = 0;
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] += a*b;
            hap+=arr[i];
        }
        if(price == hap){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}

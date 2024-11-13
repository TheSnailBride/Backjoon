package Section12_BruteForce;

import java.util.Scanner;

public class 분해합_Num2231 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int result = 0;
        for(int i=0; i<n; i++){
            int target = i;
            int sum =i ;

            while(target > 0){
                sum+=target%10;
                target/=10;
            }
            if(sum == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}

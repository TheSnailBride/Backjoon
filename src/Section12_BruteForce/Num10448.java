package Section12_BruteForce;

import java.util.Scanner;

public class Num10448 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for(int i=0; i<n; i++){
            int a = in.nextInt();
            System.out.println(search(a));
        }
    }
    public static int search(int V){
        int sum = 0 ; // 3개의 n(n+1) 이 == V같으면 성립함

        for(int i=1; i<45; i++){
            for (int j = 1; j<45; j++){
                for (int k=1; k<45; k++){
                    if(i*(i+1)/2 + j*(j+1)/2 + k*(k+1)/2 == V){
                        return 1;
                    }
                }
            }

        }
        return 0;

    }
}

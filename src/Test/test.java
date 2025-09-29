package Test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int n = scanner.nextInt();
        int sum =0;

        for (int i=1; i<n; i++) {
            if(n%i==0){
                System.out.println(i);
                sum+=i;
            }
        }

        if(sum==n){
            System.out.println("완전수");
        }else{
            System.out.println("완전수 아님");
        }

    }//main
}

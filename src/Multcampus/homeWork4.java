package Multcampus;


import java.util.Scanner;

public class homeWork4 {
    public static void main(String[] args) {

        int random = (int)(Math.random()*100) +1;
        int num =0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("숫자를 예측해주세요 (1~100) :");
            int input  = sc.nextInt();
            num++;
            if(input > random) {
                System.out.println("더 작은 수 입니다.");
            }else if(input < random){
                System.out.println("더 큰 수 입니다.");
            }else {
                System.out.println("정답입니다! 시도 횟수:"+num);
                break;
            }
        }
    }
}

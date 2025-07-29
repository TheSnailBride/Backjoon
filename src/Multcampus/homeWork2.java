package Multcampus;

import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        int result =0;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("두 숫자를 입력 하시오:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println("\n원하는 연산을 선택하세요:");
            System.out.println("1. 덧셈");
            System.out.println("2. 뺄셈");
            System.out.println("3. 곱셈");
            System.out.println("4. 나눗셈");
            System.out.println("5. 종료");

            int var = sc.nextInt();

            switch(var){
                case 1: result = num1+num2; break;

                case 2: result = num1-num2; break;
                case 3: result = num1*num2; break;

                case 4:
                    if(num2==0) {
                        System.out.println("0으로 나눌 수 없습니다");
                        continue;
                    }

                    result = num1/num2;
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("잘못된 선택입니다.");
            }
            System.out.println("결과"+result);
        }



    }
}

package Multcampus;

import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("점수를 입력하세요:");
        int score = in.nextInt();


        System.out.println("당신의 등급은" + (score>=90? "A": score >= 80? "B" : score >=70? "C" : score>=60? "D" : "F" ) + "입니다");


    }
}

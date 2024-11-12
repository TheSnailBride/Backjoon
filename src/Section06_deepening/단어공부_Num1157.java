package Section06_deepening;

import java.util.Scanner;

public class 단어공부_Num1157 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        String target = in.nextLine();

        int number =0;
        int[] arr = new int[26]; //65
        for(int i=0; i<target.length(); i++){

            if(target.charAt(i)<='Z' && target.charAt(i)>='A') {
                number = target.charAt(i) - 65;
                arr[number]++;
            }
            if(target.charAt(i)<='z' && target.charAt(i)>='a'){
                number = target.charAt(i) - 97;
                arr[number]++;
            }
        }
        int m = -1;
        char c= '?';

        for(int i=0; i<26; i++){
            if(arr[i]>m){
                m = arr[i];
                c = (char) (i+65);
            }else if(arr[i] == m){
                c = '?';
            }
        }
        System.out.println(c);
    }
}

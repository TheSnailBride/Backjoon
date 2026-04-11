package Section12_BruteForce;

import java.util.Scanner;

public class Num1969다시 {
    public static int M,N;
    public static int min = Integer.MAX_VALUE;
    public static String minWord;
    public static String[] arr;
    public static String[] firstWord = new String[]{"A", "T", "G", "C"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //A, T, G, C
        N = in.nextInt(); // N<100
        M = in.nextInt(); // M<50 글자 길이 글자는 4개가 끝임

        arr = new String[N];

        for(int i=0; i<N; i++){
            arr[i] = in.next();
        }

        System.out.println(minWord);
        System.out.println(min);

    }
    public static void search(int depth, String word){
        if(depth == M){
            int count =0;
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(arr[i].charAt(j) != word.charAt(j)) count++;
                }
            }
            if(min>count){
                minWord = word;
                min = count;
            }
            return;
        }

        //반복문으로 글자 만들기
        for(int i=0; i<firstWord.length; i++){
            search(depth+1, word+firstWord[i]);
        }

    }
}

package Section12_BruteForce;

import java.util.HashSet;
import java.util.Scanner;

public class 소수찾기 {
    public static String[] arr ;
    public static boolean[] visited;
    public static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.next(); // 문자

        arr = input.split("");
        visited = new boolean[input.length()];

        //숫자 만들고 소수 판별
        String sum="";

        brute( sum, 0 );

        System.out.println(set.size());
    }
    public static void brute( String sum, int depth){

        if(!sum.equals("")){
            int num = Integer.parseInt(sum);
            if(isDecimal(num)) set.add(num);
        }
        if(depth == arr.length){
            return;
        }

        // 소수 판별


        for(int i = 0; i< visited.length; i++){
            if(!visited[i]) {
                visited[i] = true;
                brute( sum+arr[i], depth+1);
                visited[i] = false;
            }

        }
    }
    public static boolean isDecimal(int num){

        if(num < 2 ) return false ;

        for(int i=2; i<num; i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}

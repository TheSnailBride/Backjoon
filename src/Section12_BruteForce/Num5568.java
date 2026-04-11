package Section12_BruteForce;

import java.util.HashSet;
import java.util.Scanner;

public class Num5568 { // hashset 저장
    public static int k;
    public static HashSet<String> set = new HashSet<>();
    public static String[] arr;
    public static boolean[] visited;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        k = in.nextInt(); // n 개중에 k 개를 선택해서 만들 수 있는 카드의 개수

        arr = new String[n];
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = in.next();
        }

        String target = "";
        search(0, target);

        System.out.println(set.size());
    }
    public static void search(int depth, String target){

        if(depth == k){
            set.add(target); // 값을 추가
        }

        for(int i=0; i < arr.length; i++){
            if(!visited[i]){
                visited[i] = true; //중복 값 체크를 위해서
                search(depth+1, target + arr[i]);
                visited[i] = false;
            }
        }

    }
}

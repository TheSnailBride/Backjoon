package Section14_MapSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 문자열집합_Num14425 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        in.nextLine();


        Set<String> set = new HashSet<>();
        for(int i=0; i<N; i++){
            set.add(in.nextLine());
        }
        int result =0;
        for(int i=0; i<M; i++){
            String input = in.nextLine();
            if(set.contains(input)) {
                result++;
            }

        }

        System.out.println(result);
    }
}

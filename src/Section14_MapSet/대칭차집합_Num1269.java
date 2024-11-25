package Section14_MapSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 대칭차집합_Num1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            set2.add(Integer.parseInt(st.nextToken()));
        }

        int result =0;

        for(int target : set){
            if(!set2.contains(target)) result++;
        }
        for(int target : set2){
            if(!set.contains(target)) result++;
        }
        System.out.println(result);
    }
}

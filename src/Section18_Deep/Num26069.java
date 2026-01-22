package Section18_Deep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class Num26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st ;
        int N = Integer.parseInt(br.readLine());


        HashSet<String> set = new HashSet<>();

        set.add("ChongChong");

        for(int i=0;i<N; i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if(set.contains(a) || set.contains(b)) {
                set.add(a);
                set.add(b);
            };


        }
        System.out.println(set.size());



    }
}

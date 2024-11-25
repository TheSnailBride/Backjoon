package Section14_MapSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class 듣보잡_Num1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for(int i=0; i<N; i++){
            set.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();

        for(int i=0; i<M; i++){
            String target = br.readLine();
            if(set.contains(target)){
                result.add(target);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());

        for(String str : result){
            System.out.println(str);
        }
    }
}

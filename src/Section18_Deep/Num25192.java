package Section18_Deep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashSet;

public class Num25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count =0;
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<N; i++){
            String input = br.readLine();


            if(input.equals("ENTER")) set.clear(); //초기화
            else if(set.contains(input)){
                continue;
            }else{
                set.add(input);
                count++;
            }
        }
        System.out.println(count);
    }
}

package Section14_MapSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());

        int[] arr_M = new int[M];
        for(int i=0; i<M; i++){
            arr_M[i] = Integer.parseInt(st.nextToken());
        }
    }
}

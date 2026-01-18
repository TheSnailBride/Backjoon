package Section25_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Long[] arr = new Long[K];

        long right = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = Long.parseLong(br.readLine());
            right = Math.max(right, arr[i]);
        }

        long left =1;
        long answer = 0;

        while(left <= right){
            long mid = (left+ right)/2;
            long count =0;

            for(long l : arr){
                count += l/mid;
            }

            if(count >=N){
                answer = mid;
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        System.out.println(answer);
    }
}

package Section25_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num_1920 {

    static boolean binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left + right)/2;

            if(arr[mid] == target) return true;
            else if(arr[mid] < target) left =mid +1;
            else right = mid -1;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());


        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i<M; i++){
            int target = Integer.parseInt(st.nextToken());

            sb.append(binarySearch(arr,target)?1:0).append("\n");

        }
        System.out.println(sb.toString());
    }
}

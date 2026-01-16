package Section25_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num10816 {

    static int leftBound(int[] arr, int target){
        int left =0;
        int right = arr.length;

        while(left < right ){
            int mid = (left + right) /2;

            if(arr[mid] >= target) right =mid;
            else left = mid +1;


        }
        return left ;
    }

    static int rightBound(int[] arr, int target){
        int left = 0;
        int right =arr.length;

        while(left < right){
            int mid = (left + right)/2;

            if(arr[mid] > target) right = mid;
            else left = mid +1;
        }
        return left -1 ;

    }
    public static void main(String[] args) throws IOException { //d??

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<M; i++){
            int target = Integer.parseInt(st.nextToken());
            int count = rightBound(arr,target)- leftBound(arr,target) +1;
            sb.append(count+" ");
        }


        System.out.println(sb.toString());
    }
}

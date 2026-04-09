package Section12_BruteForce;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Num3085 {

    public static int maxCount =0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        char[][] arr = new char[N][N];

        for(int i=0; i<N; i++){
            String input = in.next();
            for(int j=0; j<N; j++){
                arr[i][j] = input.charAt(j);
            }
        }
        candy(arr);

        System.out.println(maxCount);

    }
    public static void candy(char[][] arr){ //swap -> 계산 -> swap

        //행 값을 바꿈
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                //swap -> 계산 -> 다시 swap
                swap(arr,i,j,i,j+1);
                countCandy(arr);
                swap(arr,i,j+1,i,j);
            }
        }
        //열 값을 바꿈
        for(int i=0; i<arr.length-1; i++){
            for(int j=0;j< arr.length; j++){
                swap(arr,i,j,i+1,j);
                countCandy(arr);
                swap(arr,i+1,j,i,j);
            }
        }

        //같은 행, 같은 열에 먹을 수 있는 사탕을 계산
    }
    public static void swap(char[][] arr, int x1, int y1, int x2, int y2){
        char temp = arr[x2][y2];
        arr[x2][y2] = arr[x1][y1];
        arr[x1][y1] = temp;
    }

    public static void countCandy(char[][] arr){ //먹을 수 있는 사탕 계산
        int n = arr.length;

        for(int i=0; i<n; i++){ // 같은 행 비교
            int count =1 ;
            for(int j=0; j<n-1; j++){
                if(arr[i][j] == arr[i][j+1]) {
                    count ++;
                    maxCount = Math.max(count,maxCount);
                }else{
                    count =1;
                }
            }
        }

        for(int i=0; i<n; i++){
            int count =1;
            for(int j=0; j<n-1; j++){
                if(arr[j][i] == arr[j+1][i]){
                    count++;
                    maxCount = Math.max(count,maxCount);
                }else{
                    count =1;
                }

            }
        }
    }
}

package Section14_MapSet;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자카드_Num10815 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] n_arr = new int[n];

        for(int i=0; i<n; i++){
            n_arr[i] = in.nextInt();
        }

        Arrays.sort(n_arr);

        int m = in.nextInt();
        int[] m_arr = new int[m];
        for(int i=0; i<m; i++){
            m_arr[i] = in.nextInt();
        }


        int[] result = new int[m];
        for(int i=0; i<m_arr.length; i++){
            for(int j=0; j<n_arr.length; j++){
                if(m_arr[i] == n_arr[j]) {
                    result[i]=1;
                    break;
                }else{
                    result[i] =0;
                }
            }
        }
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}

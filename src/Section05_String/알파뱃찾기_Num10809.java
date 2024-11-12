package Section05_String;

import java.util.Arrays;
import java.util.Scanner;

public class 알파뱃찾기_Num10809 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[26];
        Arrays.fill(arr,-1);

        String str = in.nextLine();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(arr[ch - 'a'] == -1){
                arr[ch -'a'] = i ;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }
}

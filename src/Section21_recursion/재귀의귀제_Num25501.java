package Section21_recursion;

import java.util.Scanner;

public class 재귀의귀제_Num25501 {
    public static int recursion(String s, int l, int r){
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        String[] arr = new String[num];

        for(int i=0; i<num; i++){
            arr[i] = in.nextLine();
        }
        for(int i=0; i<arr.length; i++){
//            System.out.println(isPalindrome(arr[i]), recursion(arr[i], 0, arr[i].length() ));
        }
    }
}

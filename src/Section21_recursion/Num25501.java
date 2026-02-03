package Section21_recursion;

import java.io.*;
import java.nio.Buffer;

public class Num25501 {
    static int count;

    static int isPalindrome(String s, int start, int last){
        count++;
        if(start >= last) return 1;
        else if(s.charAt(start) != s.charAt(last)) return 0;
        else return isPalindrome(s, start+1, last-1);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            String s = br.readLine();
            count =0;

            int result = isPalindrome(s, 0, s.length()-1);
            sb.append(result).append(" ").append(count).append("\n");
        }

        System.out.println(sb.toString());

    }
}

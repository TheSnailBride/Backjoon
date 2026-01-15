package Section16_StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Num9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());


        for(int i=0; i<N; i++){
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            for(int j=0; j<input.length(); j++){
                if(input.charAt(j) == '('){
                    stack.push(input.charAt(j));
                }else{
                    if(stack.empty()){
                        stack.push(input.charAt(j));
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            if(stack.empty()) System.out.println("YES");
            else System.out.println("NO");


        }

    }
}

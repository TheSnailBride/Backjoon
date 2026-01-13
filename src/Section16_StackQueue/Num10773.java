package Section16_StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Num10773 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st ;


        Stack<Integer> stack = new Stack<>();

        int n =Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String a = br.readLine();
            st = new StringTokenizer(a);

            String input = st.nextToken();
            if(input.equals("0")){ // 여기 equals 는 문자열 비교이기 때문에 따옴표 넣어야함
                stack.pop();
            }else{

                stack.push(Integer.parseInt(input));
            }

        }

        int sum = 0;
        for(int s : stack){
            sum+=s;
        }

        System.out.println(sum);
    }
}

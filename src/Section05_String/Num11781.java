package Section05_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11781 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();

        while((str=br.readLine())!=null) {
            sb.append(str);
        }
        br.close();
        System.out.println(sb.toString());
    }
}
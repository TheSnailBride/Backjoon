package Section14_MapSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 서로다른부분문자열의개수_Num11478 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        Set<String> set = new HashSet<>();

        for(int i=0; i<str.length(); i++){
            for(int j= i+1; j<=str.length(); j++){
                set.add(str.substring(i,j));
            }
        }
        System.out.println(set.size());
    }
}

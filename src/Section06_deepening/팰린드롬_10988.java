package Section06_deepening;

import java.util.Scanner;

public class 팰린드롬_10988 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        boolean check = true;
        for(int i=0 ; i<name.length()/2; i++){
            if(name.charAt(i) != name.charAt(name.length()-1-i)){
                check = false;
                break;
            }
        }
        if(check) System.out.println(1);
            else System.out.println(0);
    }
}

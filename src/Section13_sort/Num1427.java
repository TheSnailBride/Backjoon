package Section13_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Num1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        Integer[] numbers = new Integer[n.length()];
        for(int i=0; i<n.length(); i++){
            numbers[i] = n.charAt(i)-'0';
        }
        Arrays.sort(numbers, Collections.reverseOrder());

        for(int num: numbers){
            System.out.print(num);
        }
    }
}

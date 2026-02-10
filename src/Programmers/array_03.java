package Programmers;

import java.util.HashSet;

public class array_03 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        System.out.println(set.toString());
    }
}

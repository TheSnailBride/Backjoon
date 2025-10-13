package Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {
    public static void main(String[] args) {



        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(0));
        Collections.sort(list);
    }
}
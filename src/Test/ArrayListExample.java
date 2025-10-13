package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {



        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("홍길동", 80);

        hashMap.put("김세현", 100);

        hashMap.put("홍길동", 999);

        System.out.println(hashMap.get("김세현"));


    }
}

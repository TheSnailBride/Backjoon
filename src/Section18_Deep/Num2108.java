package Section18_Deep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int hap =0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            hap+= arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Arrays.sort(arr);


        int max =0;
        for(int v: map.values()){
            max = Math.max(max,v);
        }// 가장 많이 나온 값 찾기


        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                list.add(entry.getKey());
            }
        }// 최빈값을 리스트에 넣기

        Collections.sort(list);

        int mode =0;
        if(list.size()>1){
            mode = list.get(1);
        }else{
            mode = list.get(0);
        }


        double average = (double) hap/n;

        System.out.println(Math.round(average));
        System.out.println(arr[arr.length/2]);
        System.out.println(mode);
        System.out.println(arr[arr.length-1] - arr[0]);// 범위
    }
}

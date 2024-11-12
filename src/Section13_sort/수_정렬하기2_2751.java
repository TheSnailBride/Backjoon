package Section13_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 수_정렬하기2_2751 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = in.nextInt();

        ArrayList<Integer>  list= new ArrayList<>();
        for(int i=0 ;i<num; i++){
            list.add(in.nextInt());
        }


        Collections.sort(list);

        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
//Arrays.sort() 의 경우 dual-pivot Quicksort 알고리즘을 사용한다고 했다. 물론 평균 시간복잡도가 O(nlogn) 이고 매우 빠른 알고리즘인 것은 맞다. 그러나 최악의 경우 시간복잡도는 O(n2) 이라는 점을 기억해야한다.

//첫 번째는 Collections.sort() 를 쓰는 방법이다. Collections.sort() 은 Timsort이다. Timsort 의 경우 합병 및 삽입정렬 알고리즘을 사용한다. 이렇게 두 가지가 섞여있는 정렬 알고리즘을 hybrid sorting algorithm 이라고 하는데, 합병정렬(Merge Sort)의 경우 최선, 최악 모두 O(nlogn)  을 보장하고. 삽입정렬(Insertion sort)의 경우 최선의 경우는 O(n) , 최악의 경우는 O(n2) 이다. 그리고 두 정렬 모두 안정 정렬(stable sort)이기 때문에 Timsort를 hybrid stable sorting algorithm이라고도 한다.
//
//즉, 합병정렬의 최악의 경우와 삽입정렬의 최선의 경우를 짬뽕한 알고리즘이 Timsort 라는 것이다. 실제로 파이썬이나 기타 정렬 알고리즘에서 가장 많이 쓰이는 알고리즘이기도 하다.
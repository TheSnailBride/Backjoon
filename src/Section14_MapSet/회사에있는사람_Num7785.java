package Section14_MapSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class 회사에있는사람_Num7785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        HashMap<String,String> map = new HashMap<>();

        for(int i=0; i<n; i++){
            String name = in.next();
            String work = in.next();

            if(map.containsKey(name)){
                map.remove(name);
            }else{
                map.put(name,work);
            }
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
        for(String name : list){
            System.out.println(name);
        }

    }
}

package Section14_MapSet;

import java.util.*;

public class 숫자카드_Num10815 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        HashSet s_hs = new HashSet<Integer>();

        for(int i=0; i<n; i++){ //상근이가 갖고 있는 카드
            s_hs.add(in.nextInt());
        }

        int m = in.nextInt();


        StringBuilder sb =  new StringBuilder();

        for(int i=0; i<m; i++){
            int target = in.nextInt();
            if(s_hs.contains(target)){
                sb.append("1 ");
        }else{
                sb.append("0 ");
            }


        }
        System.out.println(sb.toString());




    }
}

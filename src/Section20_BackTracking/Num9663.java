package Section20_BackTracking;

import java.util.Scanner;


public class Num9663 {
    public static int[] board ;
    public static int N;
    public static int count =0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();

        board = new int[N];

        backtrack(0);

        System.out.println(count);

    }
    public static void backtrack(int row){
        if(row == N){
            count ++;
            return;
        }

        for(int col =0; col<N; col++){
            board[row] = col;
            if(isCheck(row)){

                backtrack(row+1);
            }
        }
    }
    public static boolean isCheck(int row) {
        for (int i = 0; i < row; i++) {
            // 1. 같은 열에 있는지 체크
            if (board[i] == board[row]) return false;

            // 2. 대각선에 있는지 체크 (아까 배운 절대값 공식!)
            if (Math.abs(row - i) == Math.abs(board[row] - board[i])) return false;
        }
        return true;
    }
}

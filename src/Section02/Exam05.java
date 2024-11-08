package Section02;

import java.util.Scanner;

public class Exam05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String time = in.nextLine();
        String[] arr = time.split(" ");
        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);

        if(minute >= 45){
            minute -= 45;
            System.out.println(hour+" "+minute);
        }else{
            hour -=1;
            if(hour == -1) hour = 23;
            minute = minute + 60 - 45;
            System.out.println(hour+" "+minute);

        }
    }
}

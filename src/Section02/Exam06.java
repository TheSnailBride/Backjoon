package Section02;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String time = in.nextLine();
        int take = in.nextInt();

        String[] arr = time.split(" ");
        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);

        int hap = minute + take;
        if(hap >= 60){
            hour += hap/60;
        }

        minute = hap%60;

        if(hour >= 24){
            hour = hour % 24;
        }
        System.out.println(hour+" "+minute);


    }
}

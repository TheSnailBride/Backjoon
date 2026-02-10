import java.util.*;

public class Main {
    public static void main(String[] args) {



        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(10);
        queue.add(30);
        queue.add(70);

        System.out.println(queue.poll());
    }
}

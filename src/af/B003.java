package af;

public class B003 {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("hello lambda");
        };

        Runnable r1 = () -> System.out.println("이것은 r1 이다"); //


        r.run();

        r1.run();

        r.run();
    }
}

package af;

public class B002 {
    public static void main(String[] args) {
        Runnable r = new Runnable(){
            public void run(){
                System.out.println("hello lambda2");
            }
        };

        r.run();
    }
}

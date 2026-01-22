package adapterPattern;

public class ClientWithNoAdapter {
    public static void main(String[] args) {
        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();

        serviceA.runService();
    }
}

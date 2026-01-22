package decoratorPattern;

public class ClientWithDecorator {
    public static void main(String[] args) {
        IService decorator = new Decoreator();
        System.out.println(decorator.runSomething());
    }
}

package adapterPattern;

public class ClientWithAdapter {
    public static void main(String[] args) {
        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asb1 = new AdapterServiceB();
        asa1.runService();
        asb1.runService();
    }
//Myservice 인터페이스를 만들게 되면 구체 클래스들을 마이 클래스로 묶어버릴수 있다

}

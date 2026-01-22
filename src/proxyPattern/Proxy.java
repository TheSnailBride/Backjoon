package proxyPattern;

public class Proxy implements Iservice{
    Iservice service1;

    public String runSomething(){
        System.out.println("호출에 대한 흐름제어가 주목적");
        service1 = new Service();

        return service1.runSomething();

    }
}

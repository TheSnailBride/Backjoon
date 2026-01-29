package export001_002;

public class Driver {
    public static void main(String[] args) {
        Tire tire = new AmericaTire();
        Car car = new Car(tire); //생성자를 이용한 의존성 주입
        System.out.println(car.getTireBrand()); // 사용자가 어떤 바퀴를 사용할지 지정가능함. 미리
    }
}

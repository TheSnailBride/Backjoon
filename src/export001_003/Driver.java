package export001_003;

public class Driver {
    public static void main(String[] args) {
        Tire tire = new AmericaTire();
        Car car = new Car();
        car.setTire(tire); // 속성을 통한 의존성 주입

        System.out.println(car.getTireBrand());
    }
}

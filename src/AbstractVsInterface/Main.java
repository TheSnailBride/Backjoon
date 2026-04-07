package AbstractVsInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 객체 생성 시작 ===");
        Bat bat = new Bat("박쥐토리", 2);
        
        System.out.println("\n=== 추상 클래스 기능 (is-a) ===");
        bat.eat();         // 공통 구현 메서드 호출
        bat.makeSound();   // 자식이 구현한 추상 메서드 호출

        System.out.println("\n=== 인터페이스 기능 (can-do) ===");


        bat.takeoff();
        bat.fly();
        Flyable.showMaxAltitude();

        Sparrow sparrow = new Sparrow("짹짹이", 10);
        sparrow.eat();




//        System.out.println("\n=== 핵심 차이점 정리 ===");
//        System.out.println("1. 다중 상속: 추상 클래스는 1개만 가능(단일 상속), 인터페이스는 다중 구현 가능.");
//        System.out.println("2. 필드(변수): 추상 클래스는 인스턴스 변수(name, age)를 가져 상태를 가질 수 있음, 인터페이스는 상수(MAX_ALTITUDE)만 가능.");
//        System.out.println("3. 생성자: 추상 클래스는 생성자가 있어 자식의 초기화를 도움, 인터페이스는 생성자 없음.");
//        System.out.println("4. 목적: 추상 클래스는 공통된 필드와 메서드 공유(본질), 인터페이스는 행위의 규격화(기능)에 중점.");
    }
}

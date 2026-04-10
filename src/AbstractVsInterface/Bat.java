package AbstractVsInterface;

/**
 * 박쥐(Bat)는 동물(Animal)이며 동시에 날 수 있는 능력(Flyable)이 있습니다.
 * 추상 클래스는 1개만 상속 가능하지만, 인터페이스는 여러 개를 구현할 수 있습니다.
 */
public class Bat extends Animal implements Flyable {
    
    // 부모 추상 클래스의 생성자를 호출하여 상태(name, age) 초기화
    public Bat(String name, int age) {
        super(name, age);
        System.out.println("Bat(박쥐) 구현 클래스 생성자 호출됨");
    }

    // 1. 추상 클래스(Animal)로부터 구현해야 하는 메서드
    @Override
    public void makeSound() {
        System.out.println(name + "(박쥐)가 초음파를 보냅니다. 삐-익!");
    }

    // 2. 인터페이스(Flyable)로부터 구현해야 하는 메서드
    @Override
    public void fly() {
        System.out.println(name + "가 밤하늘을 조용히 날아다닙니다.");
    }


}

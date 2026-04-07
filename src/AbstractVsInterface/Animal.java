package AbstractVsInterface;

/**
 * [추상 클래스 (Abstract Class)]
 * 1. 'is-a' (~은 ~이다) 관계일 때 사용합니다. (예: 사자는 동물이다)
 * 2. 인스턴스 변수(상태)를 가질 수 있습니다.
 * 3. 생성자를 가질 수 있어 자식 클래스 호출 시 초기화가 가능합니다.
 * 4. 클래스이므로 단일 상속만 가능합니다.
 */
public abstract class Animal {
    protected String name;
    protected int age;

    // 생성자 가능
    public Animal(String name, int age) {
        this.name = name;
        if (age < 0) {
            throw new IllegalArgumentException("나이는 0보다 작을 수 없습니다: " + age);
        }
        this.age = age;
        System.out.println("Animal 추상 클래스 생성자 호출됨");
    }

    // 일반 메서드 (공통 로직)
    public void eat() {
        System.out.println(name + "이(가) 음식을 먹습니다.");
    }

    // 추상 메서드 (자식이 반드시 구현해야 함)
    public abstract void makeSound();
}

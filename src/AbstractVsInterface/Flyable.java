package AbstractVsInterface;

/**
 * [인터페이스 (Interface)]
 * 1. 'can-do' (~할 수 있는) 관계일 때 사용합니다. (예: 날 수 있는, 헤엄칠 수 있는)
 * 2. 인스턴스 변수(상태)를 가질 수 없고, 상수(static final)만 가질 수 있습니다.
 * 3. 생성자를 가질 수 없습니다.
 * 4. 다중 구현이 가능합니다 (implements A, B, C).
 */
public interface Flyable {
    // 자동으로 public static final (상수)
    int MAX_ALTITUDE = 10000;

    // 추상 메서드 (날기) abstract 생략 되어 잇음 public abstract void fly() 임
    //인터페이스 메소드는 자동으로 public + abstract 가 붙음
    // final 은 불변 static 은 공유

    void fly();

    // 구현객체수준에서 재정의 가능함
    default void takeoff() {
        System.out.println("날기 위해 이륙합니다.");
    }

    // 인터페이스의 것, 구현객체에서 수정할 수 없음
    static void showMaxAltitude() {
        System.out.println("비행 최대 고도는 " + MAX_ALTITUDE + "m입니다.");
    }
}

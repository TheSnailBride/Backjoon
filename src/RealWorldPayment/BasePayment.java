package RealWorldPayment;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * [추상 클래스: 공통 뼈대와 흐름 제어]
 * 1. 필드: 모든 결제 수단이 공통으로 갖는 데이터 (금액, 시간, ID)
 * 2. 템플릿 메서드(process): 결제의 표준 작업 순서를 정의
 */
public abstract class BasePayment {
    protected final String transactionId;
    protected final long amount;
    protected final LocalDateTime timestamp;

    public BasePayment(long amount) {
        this.transactionId = UUID.randomUUID().toString();
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    // 결제 프로세스의 템플릿 (흐름 제어)
    public final void process() {
        System.out.println("\n--- 결제 프로세스 시작 ---");
        validate();        // 1. 공통 검증
        executePayment();  // 2. 구체적 결제 (자식이 구현)
        logTransaction();  // 3. 공통 로그
        System.out.println("--- 결제 프로세스 종료 ---");
    }

    private void validate() {
        if (amount <= 0) throw new IllegalArgumentException("금액 오류");
        System.out.println("[Base] 검증 완료: " + amount + "원");
    }

    // 자식 클래스에서 결제 수단별로 다르게 구현할 부분
    protected abstract void executePayment();

    private void logTransaction() {
        System.out.println("[Base] 로그 기록: TX-" + transactionId);
    }
}

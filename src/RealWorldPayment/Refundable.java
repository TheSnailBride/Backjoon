package RealWorldPayment;

/**
 * [인터페이스: 환불 능력 부여]
 * 모든 결제가 환불 가능한 것은 아니므로 별도의 인터페이스로 뺍니다.
 */
public interface Refundable {
    void refund();
}

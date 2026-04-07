package RealWorldPayment;

/**
 * [신용카드 결제: 결제기능(추상 상속) + 환불기능(인터페이스 구현)]
 */
public class CreditCardPayment extends BasePayment implements Refundable {
    private final String cardNumber;

    public CreditCardPayment(long amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    protected void executePayment() {
        System.out.println("[신용카드] " + cardNumber + " 승인 중...");
    }

    @Override
    public void refund() {
        System.out.println("[신용카드] 환불 처리 완료 (TX: " + transactionId + ")");
    }
}

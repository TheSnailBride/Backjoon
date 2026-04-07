package RealWorldPayment;

/**
 * [계좌이체 결제: 결제기능(추상 상속) + 세금공제(인터페이스 구현)]
 */
public class BankTransferPayment extends BasePayment implements TaxDeductible {
    private final String bankName;

    public BankTransferPayment(long amount, String bankName) {
        super(amount);
        this.bankName = bankName;
    }

    @Override
    protected void executePayment() {
        System.out.println("[계좌이체] " + bankName + " 가상계좌 발행...");
    }

    @Override
    public void issueTaxReceipt() {
        System.out.println("[세무] 현금영수증 발행 중...");
    }
}

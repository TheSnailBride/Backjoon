package RealWorldPayment;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. 다양한 결제 수단 생성 (다형성 활용 - 부모 타입으로 관리)
        List<BasePayment> payments = new ArrayList<>();
        payments.add(new CreditCardPayment(50000, "1234-5678"));
        payments.add(new BankTransferPayment(30000, "국민은행"));

        // 2. 모든 결제 수단에 대해 공통된 프로세스(Template Method) 실행
        for (BasePayment p : payments) {
            p.process();
        }

        System.out.println("\n=== 특정 기능(인터페이스)에 따른 처리 ===");
        
        // 3. 특정 기능(인터페이스)을 가진 객체만 골라내어 처리 (환불 가능한 것만)
        for (BasePayment p : payments) {
            if (p instanceof Refundable) {
                ((Refundable) p).refund();
            }
        }

        // 4. 세금 공제 가능한 것만 골라내어 처리
        for (BasePayment p : payments) {
            if (p instanceof TaxDeductible) {
                ((TaxDeductible) p).issueTaxReceipt();
            }
        }
        
        /* 
         * [실전적 차이점 요약]
         * - 추상 클래스(BasePayment): 결제라는 행위의 '공통 뼈대'와 '순서'를 강제합니다.
         *   덕분에 어떤 결제 수단이 추가되든 validate()와 log()를 중복 작성할 필요가 없습니다.
         * 
         * - 인터페이스(Refundable, TaxDeductible): 결제 수단이 가질 수 있는 '특수 능력'을 정의합니다.
         *   신용카드는 환불이 되지만, 어떤 무통장 입금은 환불이 안 될 수도 있습니다. 
         *   이런 '선택적 기능'은 인터페이스로 구현하는 것이 훨씬 유연합니다.
         */
    }
}

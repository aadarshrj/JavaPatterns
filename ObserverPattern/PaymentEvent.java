package ObserverPattern;

public class PaymentEvent {
    private final PaymentSubject paymentSubject;

    public PaymentEvent(PaymentSubject paymentSubject) {
        this.paymentSubject = paymentSubject;
    }

    public PaymentSubject getPaymentSubject() {
        return paymentSubject;
    }
}

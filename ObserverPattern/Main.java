package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();
        PaymentListener p2 = new PaymentEventLogger("23");
        paymentManager.registerPaymentListener(e ->{
       //     e.getPaymentSubject().unregisterPaymentListener(this);
        });

        paymentManager.registerPaymentListener(new NotificaationManager());
        paymentManager.registerPaymentListener(p2);
        paymentManager.pay();

        paymentManager.unregisterPaymentListener(p2);

        paymentManager.pay();
    }
}

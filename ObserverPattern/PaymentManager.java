package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager implements PaymentSubject {

    private final List<PaymentListener> paymentListeners = new ArrayList<>();

    public void pay(){ //-> Notify some payment listener
        paymentListeners.forEach(p -> p.paymentMade(new PaymentEvent(this)));
    }

    public void registerPaymentListener(PaymentListener paymentListener){
        paymentListeners.add(paymentListener);
    }
    public void unregisterPaymentListener(PaymentListener paymentListener){
        paymentListeners.remove(paymentListener);
    }
}

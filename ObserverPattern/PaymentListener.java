package ObserverPattern;

//It executes the behavior
@FunctionalInterface
public interface PaymentListener {

    void paymentMade(PaymentEvent pe);

}

package ObserverPattern;

public class NotificaationManager implements PaymentListener {

    private void sendNotification(){
        System.out.println("Sent the payment");
    }

    @Override
    public void paymentMade(PaymentEvent paymentEvent) {
        sendNotification();
    }
}

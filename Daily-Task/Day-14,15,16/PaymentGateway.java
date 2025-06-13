public interface PaymentGateway {
    void processPayment(double amount);
}
class CreditCardPayments implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
   class UPIPayments implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}
    class Mainssss {
    public static void main(String[] args) {
        PaymentGateway creditCard = new CreditCardPayments();
        PaymentGateway upi = new UPIPayments();

        creditCard.processPayment(100.50);
        upi.processPayment(75.25);
    }
}
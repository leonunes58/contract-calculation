package services;

public class PaypalService implements OnlinePaymentService {
    public double paymentFee(double amount) {
        return amount * 0.05;
    }
    public double interest(double amount, int months) {
        return amount;
    }
}

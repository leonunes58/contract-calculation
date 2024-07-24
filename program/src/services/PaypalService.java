package services;

public class PaypalService implements OnlinePaymentService {


    public double paymentFee(double amount) {
        return amount * 0.02;
    }
    public double interest(double amount, int months) {
        for(int i = 1; i <= months; i++) {
            double interest = amount * 0.01 + amount;
            return paymentFee(interest) + interest * i;
        }
        return amount;
    }

}

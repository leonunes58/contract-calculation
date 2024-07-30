package services;

import entities.Contract;
import entities.Installment;

import java.util.List;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    List<Installment> calculateInstallments(Contract contract, int months) ;
}

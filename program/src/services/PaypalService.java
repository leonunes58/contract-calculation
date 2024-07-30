package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class PaypalService implements OnlinePaymentService {


    public double paymentFee(double amount) {
        return amount * 0.02;
    }
    public List<Installment> calculateInstallments(Contract contract, int months) {
        double installmentValueByMonth = contract.getTotalValue() / months;
        List<Installment> installmentList = new ArrayList<>();
        for(int i = 1; i <= months; i++) {
            double installmentValue = installmentValueByMonth * (i/100) + installmentValueByMonth;
            installmentValue = paymentFee(installmentValue) + installmentValue;

            LocalDateTime installmentDate = contract.getDate().plusMonths(i);

            Installment installment = new Installment(installmentDate, installmentValue);
            installmentList.add(installment);
        }
        return installmentList;
    }

}

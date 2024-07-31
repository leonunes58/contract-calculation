package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class PaypalService implements OnlinePaymentService {


    public double paymentFee(double amount) {
        return amount * 0.02;
    }
    public List<Installment> calculateInstallments(Contract contract, int months) {
        double installmentValueByMonth = contract.getTotalValue() / months;
        double addeValueByMonth = installmentValueByMonth;
        List<Installment> installmentList = new ArrayList<>();
        for(int i = 1; i <= months; i++) {
            double installmentValue = installmentValueByMonth * ((double) i /100) + installmentValueByMonth;
            installmentValue = paymentFee(installmentValue) + installmentValue;

            LocalDate installmentDate = contract.getDate().plusMonths(i);

            Installment installment = new Installment(installmentDate, installmentValue);
            installmentList.add(installment);
            addeValueByMonth = addeValueByMonth + installmentValue;
        }
        return installmentList;
    }

}

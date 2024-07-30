package services;

import entities.Contract;
import entities.Installment;

import java.util.List;

public class ContractService {
    private final OnlinePaymentService service = new PaypalService();
    public List<Installment> processContract(Contract contract, int months) {
        return service.calculateInstallments(contract, months);
    }
}

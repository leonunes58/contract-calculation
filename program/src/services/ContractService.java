package services;

import entities.Contract;

public class ContractService {
    public void processContract(Contract contract, int months) {
        OnlinePaymentService service = new PaypalService();
    }
}

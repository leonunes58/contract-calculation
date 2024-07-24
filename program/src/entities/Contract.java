package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private int number;
    private LocalDateTime date;
    private Double totalValue;

    private List<Installment> installments = new ArrayList<>();

    public Contract(int number, LocalDateTime date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallment(Installment installment) {
        installments.add(installment);
    }
}
